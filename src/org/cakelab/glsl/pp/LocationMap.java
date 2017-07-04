package org.cakelab.glsl.pp;

import java.util.Arrays;

import org.cakelab.glsl.Interval;
import org.cakelab.glsl.Location;
import org.cakelab.glsl.lang.ast.Expression;
import org.cakelab.glsl.pp.LocationMap.SimpleArrayList.Comparator;

public class LocationMap {

	public class Mark {

		private int lines;
		private int macros;

		public Mark(int lines, int macros) {
			this.lines = lines;
			this.macros = macros;
		}

	}



	public static class SimpleArrayList<T> {

		public interface Comparator<K, T> {
			int compare(K key, T obj);
		}


		private static final int CAPACITY_INCREASE = 512;
		int size = 0;
		Object[] entries = new Object[CAPACITY_INCREASE];
		
		public void add(T entry) {
			if (size >= entries.length) {
				entries = Arrays.copyOf(entries, entries.length + CAPACITY_INCREASE);
			}
			entries[size] = entry;
			size++;
		}

		@SuppressWarnings("unchecked")
		public T get(int index) {
			if (index >= size) throw new IndexOutOfBoundsException();
			return (T) entries[index];
		}

		
		public <K> int find(K key, Comparator<K,T> comparator) {
			return binarySearch(key, 0, size, comparator);
		}
		
		@SuppressWarnings("unchecked")
		private <K> int binarySearch(K key, int start, int end, Comparator<K, T> comparator) {
			int n = end - start;
			if (n > 1) {
				int pivot = ((n+1)/2) + start;
				if (0 <= comparator.compare(key, (T)entries[pivot])) {
					return binarySearch(key, pivot, end, comparator);
				} else {
					return binarySearch(key, start, pivot, comparator);
				}
			} else {
				return start;
			}
		}
		
		public void discardAll(int index) {
			size = index;
		}

		public int size() {
			return size;
		}
		
	}

	
	public static class Entry {
		Location loc;
		int outputPos;
		
		public Entry(Location loc, int outputPos) {
			this.loc = loc;
			this.outputPos = outputPos;
		}
		
	}
	
	
	public static class TextLineEntry extends Entry {
		public TextLineEntry(Location loc, int outputPos) {
			super(loc, outputPos);
		}
		
	}

	public static class MacroCallEntry extends Entry {
		
		Expression macroInvokation;
		int outputEnd; // end position in preprocessor output

		public MacroCallEntry(Expression call, int outputStart, int outputEnd) {
			super(call.getStart(), outputStart);
			this.outputEnd = outputEnd;
			this.macroInvokation = call;
		}

		public boolean contains(int outputPos) {
			return outputPos >= this.outputPos && outputPos <= this.outputEnd;
		}
		
	}

	SimpleArrayList<TextLineEntry> lines = new SimpleArrayList<TextLineEntry>();
	
	SimpleArrayList<MacroCallEntry> macros = new SimpleArrayList<MacroCallEntry>();

	public void reportLineEnd(Location loc, int outputPosition) {
		lines.add(new TextLineEntry(loc, outputPosition+1));
	}
	
	public void reportMacroCall(Expression call, int outputStart, int outputEnd) {
		macros.add(new MacroCallEntry(call, outputStart, outputEnd));
	}
	
	/**
	 * Report a switch of location (input source and/or line number).
	 * 
	 * A location switch may override a previous text line start.
	 * 
	 * @param location
	 * @param outputPos
	 */
	public void reportLocationSwitch(Location location, int outputPos) {
		int lastLine = lines.size()-1;
		if (lastLine>=0 && lines.get(lastLine).outputPos == outputPos) {
			// if report refers to the same location then
			// --> overwrite last text line entry
			lines.discardAll(lastLine);
		}
		
	}

	
	public Mark mark() {
		return new Mark(lines.size(), macros.size());
	}
	
	public void rewind(Mark mark) {
		lines.discardAll(mark.lines);
		macros.discardAll(mark.macros);
	}
	
	
	private Entry find(int outputPos) {
		Comparator<Integer, MacroCallEntry> compM = new SimpleArrayList.Comparator<Integer,MacroCallEntry>() {
			@Override
			public int compare(Integer key, MacroCallEntry obj) {
				return obj.outputPos - key;
			}
		};
		Comparator<Integer, TextLineEntry> compT = new SimpleArrayList.Comparator<Integer,TextLineEntry>() {
			@Override
			public int compare(Integer key, TextLineEntry obj) {
				return obj.outputPos - key;
			}
		};
		int index = macros.find(outputPos, compM);
		
		MacroCallEntry macroCallEntry = macros.get(index);
		if (macroCallEntry.contains(outputPos)) {
			return macroCallEntry;
		} else {
			index = lines.find(outputPos, compT);
			return lines.get(index);
		}
	}
	
	public Interval getInterval(int outputStart, int outputEnd) {
		return new Interval(getStartLocation(outputStart), getEndLocation(outputEnd));
	}

	public Location getStartLocation(int outputPos) {
		Entry entry = find(outputPos);
		if (entry instanceof MacroCallEntry) {
			int macroExpandedOffset =  outputPos - entry.outputPos;
			return new MacroExpandedLocation(entry.loc, macroExpandedOffset, ((MacroCallEntry)entry).macroInvokation);
		} else {
			return textLocation(entry, outputPos);
		}
	}
	
	public Location getEndLocation(int outputPos) {
		Entry entry = find(outputPos);
		if (entry instanceof MacroCallEntry) {
			int macroExpandedOffset =  outputPos - entry.outputPos;
			return new MacroExpandedLocation(((MacroCallEntry)entry).macroInvokation.getEnd(), macroExpandedOffset, ((MacroCallEntry)entry).macroInvokation);
		} else {
			return textLocation(entry, outputPos);
		}
	}
	
	private Location textLocation(Entry entry, int outputPos) {
		int offset = entry.outputPos - outputPos;
		int pos = entry.loc.getPosition() + offset;
		int column = entry.loc.getColumn() + offset;
		int line = entry.loc.getLine();
		return new Location(entry.loc.getSourceIdentifier(), pos, line, column);
	}

}
