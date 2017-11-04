package org.cakelab.glsl.builtin;

import java.io.IOException;

import org.cakelab.glsl.GLSLVersion;
import org.cakelab.glsl.Resource;
import org.cakelab.glsl.ResourceManager;
import org.cakelab.glsl.impl.JarResourceManager;

/**
 * <h3>ATTENTION!<h3>
 * Builtin Resource Manager is used to retrieve references of 
 * files containing built-in symbols. All resources will be 
 * assigned with a <b>negative</b> source id, which is usually
 * invalid. Thus, this resource manager is for built-in 
 * purposes only!
 * 
 * @author homac
 *
 */
public class BuiltinResourceManager extends JarResourceManager implements ResourceManager {

	public static class ReverseCountingIdProvider implements ResourceIdProvider {

		private static final int INITIAL_ID = -1;
		private int nextId;

		public ReverseCountingIdProvider() {
			reset();
		}
		
		@Override
		public String getNextId() {
			return Integer.toString(nextId--);
		}

		@Override
		public void reset() {
			nextId = INITIAL_ID;
		}

		@Override
		public boolean isUsed() {
			return nextId != INITIAL_ID;
		}

		@Override
		public void consume(String id) {
			try {
				int i = Integer.valueOf(id);
				if (i <= nextId) nextId = i-1;
			} catch (NumberFormatException e) {
				// not a number -> no conflict possible
			}
		}

	}

	private static final String BUILTIN_URL_PROTOCOL = "builtin://";
	private String baseDir;

	public BuiltinResourceManager(String baseDir) {
		super(new ReverseCountingIdProvider());
		this.baseDir = baseDir;
	}

	@Override
	protected String toUrl(String relpath) throws IOException {
		if (!relpath.startsWith(BUILTIN_URL_PROTOCOL)) {
			return BUILTIN_URL_PROTOCOL + toAbsolutePath(relpath);
		} else {
			return relpath;
		}
	}

	private String toAbsolutePath(String relpath) {
		// FIXME: This is not actually an absolute path yet
		if (!isAbsolutePath(relpath)) {
			relpath = baseDir + "/" + relpath;
		}
		return relpath;
	}

	protected String toJarPath(String url) {
		if (!url.startsWith(BUILTIN_URL_PROTOCOL)) {
			throw new Error("expected url but got '" + url + "'");
		} else {
			url = url.substring(BUILTIN_URL_PROTOCOL.length());
		}
		return toAbsolutePath(url);
	}

	private boolean isAbsolutePath(String relpath) {
		return relpath.startsWith(baseDir);
	}

	public Resource resolve(GLSLVersion.Profile profile, int version, String filename) throws IOException {
		String url = profile.name() + "/V" + version + "/" + filename;

		return resolve(url);
	}

	
	
	
}
