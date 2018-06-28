package es.redmic.test.unit.exception.data;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.data.ItemNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ItemNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "name",
				value = "prueba";
		// @formatter:on

		checkMessage(new ItemNotFoundException(field, value), ExceptionType.ITEM_NOT_FOUND.toString(),
				Arrays.asList(field, value));
	}
}