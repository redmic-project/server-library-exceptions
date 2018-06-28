package es.redmic.test.unit.exception.database;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

import org.hibernate.JDBCException;
import org.junit.Test;
import org.springframework.dao.DataIntegrityViolationException;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.database.DBConstraintViolationException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DBConstraintViolationExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String msg = "startdate debe ser menor que enddate";

		SQLException sqlException = new SQLException(msg);
		JDBCException cause = new JDBCException(msg, sqlException);

		checkMessage(new DBConstraintViolationException(new DataIntegrityViolationException(msg, cause)),
				ExceptionType.DB_CONSTRAINT_VIOLATION.toString(), Arrays.asList(msg));
	}
}
