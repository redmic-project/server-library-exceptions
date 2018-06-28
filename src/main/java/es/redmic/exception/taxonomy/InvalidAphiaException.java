package es.redmic.exception.taxonomy;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class InvalidAphiaException extends BadRequestException {

	private static final long serialVersionUID = 2158718975605856820L;

	public InvalidAphiaException(String aphia) {

		super(ExceptionType.INVALID_APHIA);
		setFieldErrors(Arrays.asList(aphia));
	}
}