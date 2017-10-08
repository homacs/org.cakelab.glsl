package org.cakelab.glsl.builtin.extensions;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Contains a list of all extension that are known to exist sorted by ARB, GL and ES extensions. 
 * 
 * @author homac
 *
 */
public class KnownExtensions {
	private static final String DIRECTORY = KnownExtensions.class.getPackage().getName().replace('.', '/');

	private static final HashSet<String> ARB = new HashSet<String>();
	private static final HashSet<String> GL = new HashSet<String>();
	private static final HashSet<String> ES = new HashSet<String>();
	
	static {
		readList("ARB_extensions.txt", ARB);
		readList("GL_extensions.txt", GL);
		readList("ES_extensions.txt", ES);
	}
	
	/** Tests if name is the name string of any known extension */
	public static boolean containsAny(String name) {
		return ARB.contains(name) || GL.contains(name) || ES.contains(name);
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
	
	private static void readList(String name, HashSet<String> list) {
		InputStream in = KnownExtensions.class.getClassLoader().getResourceAsStream(DIRECTORY + '/' + name);
		if (in != null) {
			Scanner s = new Scanner(in);
			while (s.hasNextLine()) {
				String ext = s.nextLine().trim();
				if (ext.length() > 0) {
					list.add(ext);
				}
			}
			s.close();
		} else {
			System.err.println("could not read known extensions list '" + name + "'");
		}
	}
	
	
}
