package es.redmic.test.unit.exception.database;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.database.DBQueryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DBQueryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new DBQueryException(), ExceptionType.DB_QUERY.toString(), null);
	}
}
