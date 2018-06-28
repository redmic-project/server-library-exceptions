package es.redmic.exception.utils;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class WormsUpdateException extends BadRequestException {

	private static final long serialVersionUID = 2158718975605856820L;

	public WormsUpdateException(String aphia) {

		super(ExceptionType.WORMS_UPDATE_ERROR);
		setFieldErrors(Arrays.asList(aphia));
	}
}