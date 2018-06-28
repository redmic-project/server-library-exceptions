package es.redmic.exception.database;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class DBQueryException extends ConflictException {

	private static final long serialVersionUID = 4930508525288338866L;

	public DBQueryException() {
		this(null);
	}

	public DBQueryException(Exception e) {
		super(ExceptionType.DB_QUERY, e);
	}
}