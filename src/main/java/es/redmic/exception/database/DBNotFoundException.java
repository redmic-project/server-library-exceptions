package es.redmic.exception.database;

import java.util.Arrays;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class DBNotFoundException extends ConflictException {

	private static final long serialVersionUID = 3658782399097632577L;

	public DBNotFoundException(String field, String value) {

		super(ExceptionType.DB_NOT_FOUND);
		setFieldErrors(Arrays.asList(field, value));
	}
}
