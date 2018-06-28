package es.redmic.exception.database;

import java.util.Arrays;

import org.hibernate.JDBCException;
import org.springframework.dao.DataIntegrityViolationException;

import es.redmic.exception.common.ConflictException;
import es.redmic.exception.common.ExceptionType;

public class DBConstraintViolationException extends ConflictException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DBConstraintViolationException(DataIntegrityViolationException source) {

		super(ExceptionType.DB_CONSTRAINT_VIOLATION, source);
		JDBCException ex = (JDBCException) source.getCause();
		setFieldErrors(Arrays.asList(ex.getSQLException().getLocalizedMessage()));
	}
}
