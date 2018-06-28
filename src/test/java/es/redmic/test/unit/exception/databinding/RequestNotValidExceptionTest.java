package es.redmic.test.unit.exception.databinding;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.databinding.RequestNotValidException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class RequestNotValidExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "name",
				value = "null";
		// @formatter:on

		checkMessage(new RequestNotValidException(field, value), ExceptionType.REQUEST_NOT_VALID.toString(),
				Arrays.asList(field, value));
	}
}
