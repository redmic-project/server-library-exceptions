package es.redmic.exception.databinding;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class DateTimeSerializerException extends BadRequestException {

	private static final long serialVersionUID = 4972411864099973243L;

	public DateTimeSerializerException(String expectedFormat, String dateTime) {

		this(expectedFormat, dateTime, null);
	}

	public DateTimeSerializerException(String expectedFormat, String dateTime, Exception e) {

		super(ExceptionType.SERIALIZE_DATETIME_ERROR, e);
		setFieldErrors(Arrays.asList(expectedFormat, dateTime));
	}
}
