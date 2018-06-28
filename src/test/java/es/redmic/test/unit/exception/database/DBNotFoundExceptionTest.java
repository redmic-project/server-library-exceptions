package es.redmic.test.unit.exception.database;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.database.DBNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DBNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "id",
			value = "5";
		// @formatter:on

		checkMessage(new DBNotFoundException(field, value), ExceptionType.DB_NOT_FOUND.toString(),
				Arrays.asList(field, value));
	}
}
