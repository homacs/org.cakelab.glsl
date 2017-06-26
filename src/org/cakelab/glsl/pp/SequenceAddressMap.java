package org.cakelab.glsl.pp;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Data structure and methods to efficiently store and 
 * retrieve addresses of related items in a pair of 
 * related sequences of items.
 * <br/>
 * <h3>Definitions and Terminology</h3>
 * <p>
 * Let a sequence be a list of items which have 
 * an index (position in the sequence) which shall 
 * be considered as <code>address</code>.
 * Assuming a start address of the sequence, 
 * the <code>address</code> of an item can 
 * be determined simply by adding 
 * the <code>start</code> address as an 
 * offset to the index <code>i</code> of that item:
 * <pre> address = start + i</pre>. This shall be 
 * referred to as address translation using a reference 
 * address (here the start) and an offset (here the index).
 * </p>
 * <p>
 * Two of such sequences can be related to each other, such as the 
 * input sequence of characters is related to the output
 * sequence of characters of a preprocessor. The preprocessor 
 * reads items of the input sequence and
 * produces items in the output sequence accordingly. Those 
 * items may be simply copied or items may be added (e.g. macro expansion) 
 * or even skipped (e.g. white space or comments .. like this one :P).
 * </p>
 * <p>
 * Addresses of items in related sequences can be determined by 
 * knowledge about the relative offset of the address of an 
 * input item (<em>reference address</em>) to the address 
 * of an output item (<em>translated address</em>).
 * The address of an item in the reference sequence 
 * is said to be translated to an address of a corresponding
 * item in the related sequence. Purpose of this class 
 * is to translate reference addresses into translated addresses 
 * and vice versa solely based on stored relative offsets for 
 * ranges of reference addresses.
 * </p>
 * <h3>Usage</h3>
 * <p>
 * After initialisation, the address table has to be filled 
 * before being able to lookup addresses.
 * </p>
 * <ul>
 * <li><b>Data Gathering:</b> By sequentially reporting 
 * 		<em>significant</em> related addresses 
 * 		using {@link #report(int, int)}, the table gains 
 * 		knowledge about relative offsets between translated addresses 
 * 		and related reference addresses in a pair of sequences. 
 * 		Reports are required for (1) <em>significant</em> address 
 * 		pairs, at least if (2) the relative offset is different from that of
 * 		a previous address pair. The term <em>significant</em> 
 *      addresses refers to those, which may be subject to a (reverse) 
 * 		lookup, later. Reporting every address pair will provide the 
 * 		same result, but is (slightly) less efficient (see 
 * 		notes on performance below). There are more efficient 
 * 	    methods provided as well, but those are more complex too. Namely: 
 *      {@link #skipReferences(int, int)}, {@link #insertTranslated(int, int)} 
 *      and {@link #addOffsetChange(int, int)}. Finally, the most 
 *      efficient (and most error prone) method is to insert splits manually using 
 *      {@link #addSplit(int, int)}.<br/>
 * 		The method {@link #removeAll(int)} can be used to remove 
 * 		all reported mappings starting at a given 
 * 		reference address up to the end (e.g. to rewind to 
 * 		a previous situation). Another method of that kind is {@link #discardAll(int)},
 * 		which requires the index of the first entry to 
 * 		be discarded. The latter can be obtained from #size().
 * </li>
 * <li><b>Address Lookup:</b> Method {@link #lookup(int)} determines
 * 		the translated address for a given reference address, and method 
 * 		{@link #reverse(int)} does a reverse lookup of a
 * 		reference address based on the given translated address. 
 * 		Both methods use the relative offsets reported so far.
 * </li>
 * </ul>
 * <h3>Memory Consumption and Performance:</h3>
 * <p>The class stores changes of relative offsets, associated 
 * with the reference address of its appearance in an array 
 * of primitive longs (each consisting of two 32 bit integers: 
 * <code>[address:offset]</code>). If consecutive 
 * reports result in the same relative offset (i.e. redundant), 
 * method {@link #report(int, int)} won't add a new entry. 
 * Thus, memory utilisation is usually just a fracture of 
 * the number of reports. However, the array dynamically grows 
 * by chunks of 512 preallocated entries (4kb). Shrinking is 
 * not implemented.
 * </p>
 * <p>
 * A filled table has a memory consumption complexity 
 * of <code>O(m)</code> with <code>m</code> being the
 * number of changes and <code>n</code> (<code>m &le; n</code>) 
 * being the number of addresses. A scenario where each 
 * report contains an actual offset change (i.e. <code>n = m</code>)
 * results in <code>O(n)</code> worst case memory consumption.
 * </p>
 * <p>The runtime complexity of methods is as follows:</p>
 * <ul>
 * <li>{@link #report(int, int)}: <code>O(1)</code></li>
 * <li>{@link #discardAll(int)}: <code>O(1)</code></li>
 * <li>{@link #removeAll(int)}: <code>O(log m)</code></li>
 * <li>{@link #lookup(int)}: <code>O(log m)</code></li>
 * <li>{@link #reverse(int)}: <code>O(log m)</code></li>
 * </ul>
 * @author homac
 *
 */
public class SequenceAddressMap {
	private static final long OFFSET_MASK = 0xFFFFFFFFl;
	private static final int CAPACITY_INCREASE = 512;
	/**
	 * 
	 * A split splits both sequences at a given related addresses 
	 * into subsequence (before and after split) with different offsets.
	 * 
	 * A split contains a unique reference address and an offset.
	 * The offset is a relative offset to the reference address, 
	 * used to determine the associated translated address using 
	 * the formula:
	 * <pre>
	 * translated = offset + reference
	 * </pre>
	 * Each split denotes an offset change at a given unique reference address and
	 * the offset of split[n] is valid in the interval:
	 * <pre>
	 * [ address(split[n]), address(split[n+1]) [
	 * </pre>
	 * <p>
	 * Thus, two splits define a unique region of continuous reference
	 * addresses and translated addresses, where each pair has
	 * the same relative offset. The last region has infinite length.
	 * </p>
	 * <p>
	 * Consecutive splits with the same offset are forbidden.
	 * </p>
	 * <p>
	 * In respect to region boundaries of translated addresses,
	 * there are two cases to consider:
	 * </p>
	 * <ol>
	 * <li>Reference addresses may be skipped: We define, that
	 * 	   skipped reference addresses do not map to existing 
	 * 	   translated addresses and will be mapped to the next 
	 *     valid translated address instead.
	 *     Skipped regions of reference addresses must always have
	 *     one split at the end, which refers to the next 
	 *     reference address used in a mapping to an existing 
	 *     translated address with an offset <em>decreased</em> 
	 *     by the number of skipped addresses (compared to the 
	 *     previous offset). Consecutive skips have to be merged
	 *     in a single split to maintain uniqueness of reference addresses.
	 * </li>
	 * <li>Translated addresses may be inserted: We define, that
	 *     inserted translated addresses map to the same reference 
	 *     address at the end of a region. This must be indicated with 
	 *     an offset for the split on the next valid reference address 
	 *     which (compared to the previous offset) is <em>increased</em> by 
	 *     the number of inserted translated addresses. Consecutive
	 *     inserts on the same reference address have to be merged 
	 *     in a single split to maintain uniqueness of reference addresses.
	 * </li>
	 * </ol>
	 * <p>These definitions have to be considered when inserting splits, 
	 * 	  because they will be applied during lookup and reverse lookup 
	 *    of addresses.
	 * </p>
	 * <p>To add splits according to the definitions above, use the 
	 *    following rules, to add splits (i.e. when using 
	 *    {@link #addSplit(int, int)}):
	 * </p>
	 * <ul>
	 * <li><b>General rules:</b>
	 *     <ul>
	 *     <li>Consecutive splits with the same offset are forbidden.</li>
	 *     <li>Each split must refer to a unique reference address.</li>
	 *     <li>The order of splits equals the order of their reference addresses 
	 *        (ascending).</li>
	 *     </ul>
	 * <li><b>Skip of reference address region:</b> A skip starting at reference 
	 * 		address <code>start</code> and ending at reference address
	 *      <code>end</code> (exclusive) is denoted by adding a split like this:
	 *      <pre>
	 *      addSplit(end,previousOffset + start-end)
	 *      // offset is supposed to be negative
	 *      </pre>
	 *      with <code>previousOffset</code> being the offset of the 
	 *      last split in the list.
	 *      Consecutive skips have to be merged into one single split.
	 *      Alternatively, use:
	 *      <pre>
	 *      addOffsetChange(end, start-end);
	 *      </pre>
	 *      or
	 *      <pre>
	 *      skipAddressRange(start, end);
	 *      </pre>
	 *      .
	 * </li>
	 * <li><b>Insert of translated address region:</b> An insert of 
	 *      <code>n</code> translated addresses at reference address 
	 *      <code>address</code> is denoted by adding a split like this:
	 *      <pre>
	 *      addSplit(address+1,previousOffset + n);
	 *      </pre>
	 *      with <code>previousOffset</code> being the offset of the 
	 *      last split in the list.
	 *      Consecutive insertions on the same reference address 
	 *      have to be merged into one single split.
	 *      Alternatively, use:
	 *      <pre>
	 *      addOffsetChange(address+1, n);
	 *      </pre>
	 *      or
	 *      <pre>
	 *      insertTranslated(address, n);
	 *      </pre>
	 *      .
	 * </li>
	 * </ul>
	 * The previousOffset mentioned in the rules can always be determined
	 * by the formula:
	 * <pre>
	 * offset = translated address - reference address
	 * </pre>
	 */
	long[] splits = new long[CAPACITY_INCREASE];
	/** Number of added splits. 
	 * Size is increased with each call to {@link #addSplit(int, int)} 
	 * and can be manipulated by the user with {@link #discardAll(int)} 
	 * and {@link #removeAll(int)}.
	 */
	int size;

	/** 
	 * Creates a sequence address mapping table which starts at
	 * <pre>reference  = referenceStartAddress</pre>
	 * <pre>translated = translatedStartAddress</pre>
	 * (short: [referenceStartAddress:translatedStartAddress]).
	 * <p>
	 * <b>Attention:</b> The resulting initial entry cannot be 
	 * removed from the table!
	 * </p>
	 * @param referenceStartAddress first known reference address
	 * @param translatedStartAddress first known translated address
	 */
	public SequenceAddressMap(int referenceStartAddress, int translatedStartAddress) {
		// add split
		long split = encode(referenceStartAddress, translatedStartAddress-referenceStartAddress);
		splits[++size] = split;

	}

	/** Creates a sequence address mapping table which starts at
	 * <pre>reference  = 0</pre>
	 * <pre>translated = 0</pre>
	 * (short: [0:0]).
	 * <p>
	 * <b>Attention:</b> The resulting initial entry (i.e. 0) cannot be 
	 * removed from the table!
	 * </p>
	 */
	public SequenceAddressMap() {
		this(0,0);
	}

	/**
	 * Returns the number of currently stored entries.
	 * 
	 * This can be used to discard entries to return to
	 * a previous state of the table (see {@link #discardAll(int)}).
	 * 
	 * Knowing the current size the table can be reset to this state
	 * calling
	 * <pre>
	 * table.discard(size);
	 * </pre>
	 * 
	 * @return number of stored entries.
	 * @see #discardAll(int)
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Report a unique pair of related addresses
	 * (mapping: <code>reference address &rarr; translated address</code>) 
	 * in the pair of related sequences.
	 * <p>
	 * Intended use: Report at least those address pairs, which may be subject 
	 * to a lookup later. You do not need to report address pairs, 
	 * which have the same offset as the pair of addresses, but you can. 
	 * This method will properly handle all cases and update stored
	 * information accordingly.
	 * </p>
	 * <p>
	 * Never report a translated address for a skipped reference address!
	 * Instead report the next valid translated address after 
	 * skipped reference addresses. You can however, increase the skipped 
	 * region afterwards, by reporting a new reference address for the 
	 * same next translated address.
	 * </p>
	 * <p>
	 * The method also carefully checks provided addresses to prevent 
	 * violation of the basic assumption, that reference addresses 
	 * and translated addresses are continuously increasing. 
	 * Generally, a report should be issued only, if either the reference
	 * address or the translated address differs from the last report.
	 * That said, the initial pair of addresses (see constructor documentation)
	 * counts as report too.
	 * </p>
	 * 
	 * @param address reference address
	 * @param translated associated translated address
	 * @param IllegalArgumentException Is thrown if neither reference 
	 * 			address nor translated address differ from a previous call to {@link #report(int, int)}.
	 */
	public void report(int address, int translated) {
		
		// TODO: strict rules:
		// translated > previous translated && address >= previous address

		long previous = splits[size-1];

		int previousAddress = address(previous);
		int previousOffset = offset(previous);
		int offset = translated - address;
		int offsetChange = offset - previousOffset; // (-) skip, (+) insert


		if (address > previousAddress) {
			// precondition: translated >= previousTranslated
			int previousTranslated = previousAddress + previousOffset;
			if (translated > previousTranslated) {
				if (offsetChange == 0) {
					return;
				} else {
					// inserted output at end
					// add split for next reference address
					address = address+1;
					translated = translated+1;
				}
			} else if (translated == previousTranslated) {
				// address+x:translated+-0: -> skip
				// Maps to the same translated address which
				// means, that the last report received was a skip too.
				// -> Update last entry with increased skip.
				size--;
				// otherwise: translated > previousTranslated
			} else { // if (translated < previousTranslated) {
				throw new IllegalArgumentException("translated must be larger than previous translated");
			}
		} else if (address == previousAddress) {
			// Last report was about inserted translated addresses.
			// This report can only be about skipped reference 
			// addresses because a subsequent insert must have reported
			// the same non-skipped reference address which would
			// be address-1 and not the same. Thus, if this is report
			// is not about skipped reference addresses, it is a mistake.
			int previousTranslated = previousAddress + previousOffset;
			if (translated > previousTranslated) {
				// offset change < 0
				// update last report
				size--;
			} else if (translated == previousTranslated) {
				// offset change == 0
				// allowed and expected, because the last entry was made 
				// by us to indicate the insert. This report just
				// acknowledges, that there is an actual translated
				// address mapping to this reference.
				return;
			} else { // if (translated < previousTranslated) {
				throw new IllegalArgumentException("translated must be larger than previous translated");
			}
		} else if (previousAddress == address+1) {
			// special case:
			
			// Last report was about inserted translated addresses 
			// for the same reference address. The end of inserts was
			// marked with a split of the next possibly used address pair.
			//
			// This report must be also about inserted translated 
			// addresses, otherwise it is a mistake.
			// Thus, translated must be larger or equal to previous translated
			//       or the reference address must be equal to the last entry.
			int previousTranslated = previousAddress + previousOffset;

			if (translated >= previousTranslated) {
				// another insert for same reference
				// consecutive insert
				// update last entry
				size--;
				address = previousAddress;
				translated = translated+1;
			} else if (translated < previousTranslated) {
				// reference address should have been advanced to previousAddress
				throw new IllegalArgumentException("translated must be larger than previously reported translated address.");
			}
		} else {
			throw new IllegalArgumentException("Reference address must be larger than or equal to preceeding reference address.");
		}
		
		addSplit(address, offset);
		
	}
	
	
	/** 
	 * More efficient but even more complex method to report mappings. 
	 * To be used in consumption with {@link #insertTranslated(int, int)}.
	 *
	 * Reports, that the given range of reference addresses is skipped. 
	 * This is interpreted as if all translated addresses in this range
	 * map to the last non-skipped reference address.
	 * 
	 * Formally, it skips all addresses in range
	 * <pre>
	 * [addressFrom:addressTo[
	 * </pre>
	 * (i.e. not including addressTo).
	 * <ul>
	 * <li>addressFrom cannot be lower than previously added address range.</li>
	 * <li>addressTo must be larger than addressFrom</li>
	 * </ul>
	 * 
	 * Results in a call to {@link #addOffsetChange(int, int)} with 
	 * <pre>
	 * address      := addressTo
	 * offsetChange := addressFrom - addressTo
	 * </pre>
	 * 
	 * @param addressFrom First skipped reference address
	 * @param addressTo Next non-skipped reference address
	 * @see #insertTranslated(int, int)
	 * @see #report(int, int)
	 */
	public void skipReferences(int addressFrom, int addressTo) {
		if (addressTo<=addressFrom) throw new IllegalArgumentException("addressFrom must be less than addressTo");
		if (addressFrom <= address(splits[size-1])) throw new IllegalArgumentException("skipped region intersects previous region");
		addOffsetChange(addressTo, addressFrom - addressTo);
	}

	/**
	 * More efficient but even more complex method to report mappings. 
	 * To be used in consumption with {@link #skipReferences(int, int)}.
	 * 
	 * Reports that <code>length</code> items have been added to the 
	 * output. Thus, there are <code>length</code> translated addresses,
	 * which map to the given reference address and the next reference address
	 * (address+1) will map to translated addresses with an 
	 * offset which is increased by <code>length</code>. 
	 * This results in a call to {@link #addOffsetChange(int, int)} with
	 * <pre>
	 * address      := address+1
	 * offsetChange := length
	 * </pre>
	 * 
	 * 
	 * @param address reference address, where items have been added (e.g. to the output of a preprocessor).
	 * @param length Number of added items
	 */
	public void insertTranslated(int address, int length) {
		if (length<=0) throw new IllegalArgumentException("length has to be larger than 0");
		addOffsetChange(address+1, length);
	}

	
	/** 
	 * Marks an offset change (+/-).
	 * 
	 * 
	 * The method adds a split to the end of existing address
	 * range splits (see {@link #splits}) if the following 
	 * preconditions hold:
	 * <pre>
	 * address &gt; previously reported address
	 * </pre>
	 * <pre>
	 * address + offset &gt; previously reported address + previously reported offset
	 * </pre>
	 * .
	 * 
	 * 
	 * <h3>Note:</h3>
	 * This method does not optimise stored offsets 
	 * (as {@link #report(int, int)} does).
	 * 
	 * @param address Address to be mapped to translatedAddress
	 * @param offsetChange change of offset relative to previous offset. Translated address is address + sum(offsetChange)
	 * @throws IllegalArgumentException if the address is lower than the first split entry or translated address is lower than translated address of previous split
	 */
	public void addOffsetChange(int address, int offsetChange) {
		long previous = splits[size-1];
		
		// check precondition
		if (address(previous) >= (address+offsetChange)) {
			throw new IllegalArgumentException("reference address range overlaps previous split");
		}

		// calculate cumulated offset
		int offset = offsetChange + offset(previous);


		
		long split = addSplit(address, offset);
		
		// check post condition
		if ((address(previous) + offset(previous) > address(split) + offset(split)) ) {
			throw new IllegalArgumentException("translated address range overlaps with previous split");
		}

	}

	/**
	 * 
	 * Adds new split (see {@link #splits}) with [address, offset] to the end of the list.
	 * 
	 * 
	 * @param address reference address
	 * @param offset relative offset to reference address
	 * @return Returns added split entry.
	 */
	public long addSplit(int address, int offset) {
		prealloc();
		// add split
		long split = encode(address, offset);
		splits[size] = split;
		size++;
		return split;
	}

	/** 
	 * Preallocates more memory if required. 
	 */
	private void prealloc() {
		// make room
		if (size >= splits.length) {
			splits = Arrays.copyOf(splits, splits.length + CAPACITY_INCREASE);
		}
	}

	/** 
	 * Removes all entries after the given reference address.
	 * <h3>Note:</h3> 
	 * This method uses a binary search to find the last valid split.
	 * Use {@link #discardAll(int)} instead, if performance 
	 * is an issue.
	 * 
	 * @param lastValidAddress 
	 * @throws IllegalArgumentException Thrown if lastValidAddress < initial address (see constructor).
	 * @see #SequenceAddressMappingTable()
	 * @see #SequenceAddressMappingTable(int, int)
	 * @see #discardAll(int)
	 */
	public void removeAll(int lastValidAddress) {
		if (lastValidAddress < address(splits[0])) {
			throw new IllegalArgumentException("Attempt to remove initial entry!");
		}
		int index = searchByAddress(lastValidAddress, 0, size);
		size = index+1;
	}

	/**
	 * Discards all entries from the table starting at index.
	 * <p>
	 * Index can be obtained via {@link #size()}. When using 
	 * this method to revert the table to a previous
	 * state, use the following procedure.
	 * </p>
	 * <p>Save a current state like this:</p>
	 * <pre>
	 * int state = table.size();
	 * </pre>
	 * <p>To revert to the saved state, do this:
	 * </p>
	 * <pre>
	 * table.discardAll(state);
	 * </pre>
	 * 
	 * @param index First entry to be discarded.
	 * @see #size()
	 * @throws IllegalArgumentException if index == 0 (initial entry, see {@link #SequenceAddressMappingTable(int, int)}).
	 */
	public void discardAll(int index) {
		if (index == 0) throw new IllegalArgumentException("Attempt to remove initial entry!");
		size = index;
	}

	/**
	 * Same as <code>discardAll(1)</code>.
	 * Resets to the initial state.
	 * @see #discardAll(int)
	 * @see #SequenceAddressMap()
	 * @see #SequenceAddressMap(int, int)
	 */
	public void clear() {
		discardAll(1);
	}
	
	/** 
	 * Determines the translated address for a given reference address.
	 * Lookups of addresses without existing translate addresses 
	 * (i.e. skipped reference addresses) will return the negated 
	 * translated address of the last valid reference address instead.
	 * @param address reference address
	 * @return translated address if mapping exists, otherwise -(translated-1), 
	 * the negated translated address of the last valid reference address.
	 * @throws IllegalArgumentException Thrown if address is lower then start address of this map.
	 */
	public int lookup(int address) {
		if (address < address(splits[0])) throw new IllegalArgumentException("given address lower than first known address");
		int index = searchByAddress(address, 0, size);
		
		int translated = address + offset(splits[index]);
		
		if (++index<size) {
			// check if following split marks a skipped reference address region
			int nextTranslated = address(splits[index]) + offset(splits[index]);
			if (nextTranslated <= translated) {
				// it is a skipped section 
				// -> skip to start of next split
				translated = -(nextTranslated);
			}
		}
		
		
		return translated;
	}

	/**
	 * Reverse lookup of the reference address <code>a</code>, which translates to the given <code>translated</code> address with
	 * <pre>
	 * translated = a + offset(s(i))
	 * </pre>
	 * where <code>s(i)</code> denotes the split, which satisfies
	 * <pre>
	 * address(s(i)) &le; a &lt address(s(i+1))
	 * </pre>
	 * .
	 * @param translated translated address
	 * @return reference address
	 */
	public int reverse(int translated) {
		int index = searchByTranslation(translated, 0, size);
		int address = translated - offset(splits[index]);
		if (++index<size) {
			int nextAddress = address(splits[index]);
			if (nextAddress <= address) {
				address = nextAddress-1;
			}
		}
		return address;
	}
	
	
	public void append(SequenceAddressMap map) {
		int end = size;
		size += map.size;
		prealloc();
		System.arraycopy(map.splits, 0, splits, end, map.size);
	}
	
	/**
	 * Recursive binary search for the split <pre>s(i)</pre> which translates into
	 * an address <pre>t(s(i))</pre> which satisfies
	 * <pre>
	 * t(s(i)) &le; translated &lt; t(s(i+1))
	 * </pre>
	 * where 
	 * <pre>
	 * t(s(i)) = address(s(i)) + offset(s(i))
	 * </pre>
	 * @param translated Translated address of the searched split entry.
	 * @param start Index of the first entry of the searched range of entries.
	 * @param end Index of the last entry of the searched range of entries.
	 * @return Index <code>i</code> of the found split entry.
	 */
	private int searchByTranslation(int translated, int start, int end) {
		int n = end - start;
		if (n > 1) {
			int pivot = ((n+1)/2) + start;
			int boundary = address(splits[pivot]) + offset(splits[pivot]);
			if (translated >= boundary) {
				return searchByTranslation(translated, pivot, end);
			} else {
				return searchByTranslation(translated, start, pivot);
			}
		} else {
			return start;
		}
	}

	/**
	 * Binary search for the split <pre>s(i)</pre> with address <pre>a(s(i))</pre>
	 * which satisfies
	 * <pre>
	 * a(s(i)) &le; address &lt; a(s(i+1))
	 * </pre>
	 * @param address Reference address of the searched split entry.
	 * @param start Index of the first entry of the searched range of entries.
	 * @param end Index of the last entry of the searched range of entries.
	 * @return Index <code>i</code> of the found split entry.
	 */
	private int searchByAddress(int address, int start, int end) {
		int n = end - start;
		if (n > 1) {
			int pivot = ((n+1)/2) + start;
			int boundary = address(splits[pivot]);
			if (address>= boundary) {
				return searchByAddress(address, pivot, end);
			} else {
				return searchByAddress(address, start, pivot);
			}
		} else {
			return start;
		}
	}

	/**
	 * encodes address and offset into one split entry:<br/>
	 * <code>
	 * &lt;splitentry&gt; := [address][offset]
	 * </code>
	 * <br/>
	 * .
	 * The encoded split entry is returned.
	 * @param address
	 * @param offset
	 * @return
	 */
	private long encode(int address, int offset) {
		assert (address >= 0);
		long split = address;
		split = (split<<32);
		split = split | (OFFSET_MASK&offset);
		return split;
	}
	
	/**
	 * decodes the stored offset of a split entry.
	 * @param splitentry
	 * @return
	 */
	private int offset(long splitentry) {
		return (int)(OFFSET_MASK & splitentry);
	}

	/** 
	 * decodes the stored address of a split entry.
	 * 
	 * @param splitentry
	 * @return
	 */
	private int address(long splitentry) {
		return (int)(splitentry>>32);
	}

	/**
	 * For debugging purposes. 
	 * <p>
	 * When in doubt about the implementation, 
	 * this method dumps all split entries
	 * to the given print stream. An entry is 
	 * represented by the following format:
	 * </p>
	 * <pre>
	 * [referenceAddress:cumulatedOffset]
	 * </pre>
	 * The list of all entries is terminated by a CRLF.
	 * 
	 * @param out 
	 */
	public void dump(PrintStream out) {
		for (int i = 0; i < size; i++) {
			long split = splits[i];
			out.print("[" + address(split) + ':' + offset(split) + ']');
		}
		out.println();
	}

	
}
