package es.redmic.exception.utils;

import java.util.Arrays;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class ExternalResourceException extends NotFoundException {

	private static final long serialVersionUID = 6714485190161856195L;

	public ExternalResourceException(Exception e, String resource) {

		super(ExceptionType.EXTERNAL_RESOURCE, e);
		setFieldErrors(Arrays.asList(resource));
	}

	public ExternalResourceException(String resource) {

		super(ExceptionType.EXTERNAL_RESOURCE);
		setFieldErrors(Arrays.asList(resource));
	}
}