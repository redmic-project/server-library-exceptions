package es.redmic.exception.database;

import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class DBPropertyValueException extends ConflictException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DBPropertyValueException(ConstraintViolationException source) {

		super(ExceptionType.DB_PROPERTY_ERROR, source);
		buildException(source);
	}

	public void buildException(ConstraintViolationException source) {

		ConstraintViolationException jdbcEx = (ConstraintViolationException) source;
		Set<ConstraintViolation<?>> constraints = jdbcEx.getConstraintViolations();
		String msn = null;
		String field = null;
		for (ConstraintViolation<?> i : constraints) {
			msn = i.getMessage();
			field = i.getPropertyPath().toString();
		}

		setFieldErrors(Arrays.asList(field, msn));
	}
}
