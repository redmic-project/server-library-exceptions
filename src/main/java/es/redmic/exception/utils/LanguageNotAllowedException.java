package es.redmic.exception.utils;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class LanguageNotAllowedException extends BadRequestException {

	private static final long serialVersionUID = 2158718975605856820L;

	public LanguageNotAllowedException(String lang) {

		super(ExceptionType.LANGUAGE_NOT_ALLOWED);
		setFieldErrors(Arrays.asList(lang));
	}
}