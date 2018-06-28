package es.redmic.exception.utils;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.InternalException;

public class SitemapGenerateException extends InternalException {

	private static final long serialVersionUID = 1L;

	// private static String pattern = //"Error. No se ha podido generar el
	// sitemap.";

	public SitemapGenerateException() {
		this(null);
	}

	public SitemapGenerateException(Exception e) {
		super(ExceptionType.GENERATE_SITEMAP, e);
	}
}