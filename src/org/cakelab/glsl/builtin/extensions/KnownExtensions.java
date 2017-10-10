package org.cakelab.glsl.builtin.extensions;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Contains a list of all extension that are known to exist sorted by ARB, GL and ES extensions. 
 * 
 * @author homac
 *
 */
public class KnownExtensions {
	private static final String DIRECTORY = KnownExtensions.class.getPackage().getName().replace('.', '/');

	private static final List ARB = new List();
	private static final List GL = new List();
	private static final List ES = new List();

	@SuppressWarnings("serial")
	private static class List extends HashMap<String, String[]> {

		public boolean add(String[] names) {
			for (String n : names) {
				super.put(n, names);
			}
			return true;
		}

		public boolean contains(String name) {
			return containsKey(name);
		}
		
	}
	
	
	
	static {
		readList("ARB_extensions.txt", ARB);
		readList("GL_extensions.txt", GL);
		readList("ES_extensions.txt", ES);
	}
	
	/** Tests if name is the name string of any known extension */
	public static boolean containsAny(String name) {
		return ARB.contains(name) || GL.contains(name) || ES.contains(name);
	}
	
	public static String[] getNames(String extension) {
		String[] names = null;
		if (null != (names = ARB.get(extension))) {
			return names;
		} else if (null != (names = GL.get(extension))) {
			return names;
		} else if (null != (names = ES.get(extension))) {
			return names;
		} else {
			return null;
		}
	}
	
	/** Tests if name is an ARB OpenGL extension */
	public static boolean containsARB(String name) {
		return ARB.contains(name);
	}
	
	/**  Tests if name is a vendor specific approved OpenGL extension */
	public static boolean containsGL(String name) {
		return GL.contains(name);
	}
	
	/**  Tests if name is an OpenGL ES extension */
	public static boolean containsES(String name) {
		return ES.contains(name);
	}
	
	private static void readList(String name, List list) {
		InputStream in = KnownExtensions.class.getClassLoader().getResourceAsStream(DIRECTORY + '/' + name);
		if (in != null) {
			Scanner s = new Scanner(in);
			while (s.hasNextLine()) {
				String ext = s.nextLine().trim();
				if (ext.length() > 0) {
					String[] names = ext.split(" ");
					list.add(names);
				}
			}
			s.close();
		} else {
			System.err.println("could not read known extensions list '" + name + "'");
		}
	}

	
}
