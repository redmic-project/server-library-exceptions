package es.redmic.exception.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public abstract class PatternUtils {

	// @formatter:off
	
	private final static String CHARSET = "Cp1252",
			splitterSymbol = "=";
	// @formatter:on

	private final static Map<String, String> resourcesCache = new HashMap<>();

	public static String getPattern(String key, String resourcePath) {

		String content = "";

		if (resourcesCache.get(resourcePath) != null) {
			content = resourcesCache.get(resourcePath);
		} else {
			try {
				PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
				Resource[] resources = resolver.getResources(resourcePath);

				for (Resource resource : resources) {
					content += inputStreamToString(resource.getInputStream()) + "\n";
					resourcesCache.put(resourcePath, content);
				}

			} catch (IOException e) {
				throw new InternalException(ExceptionType.INTERNAL_EXCEPTION, e);
			}
		}

		if (content != null && content.contains(key)) {

			String mess = content.substring(content.indexOf(key));
			mess = mess.split("\n")[0];
			return mess.split(splitterSymbol)[1];
		}

		return null;
	}

	private static String inputStreamToString(InputStream resource) {

		StringBuilder textBuilder = new StringBuilder();
		try (Reader reader = new BufferedReader(new InputStreamReader(resource, CHARSET))) {
			int c = 0;
			while ((c = reader.read()) != -1) {
				textBuilder.append((char) c);
			}
		} catch (IOException e) {
			throw new InternalException(ExceptionType.INTERNAL_EXCEPTION, e);
		}

		return textBuilder.toString();
	}
}
