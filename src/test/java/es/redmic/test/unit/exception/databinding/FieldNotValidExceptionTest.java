package es.redmic.test.unit.exception.databinding;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.databinding.FieldNotValidException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class FieldNotValidExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "name",
				value = "null";
		// @formatter:on

		checkMessage(new FieldNotValidException(field, value), ExceptionType.DTO_FIELD_NOT_VALID.toString(),
				Arrays.asList(field, value));
	}
}
