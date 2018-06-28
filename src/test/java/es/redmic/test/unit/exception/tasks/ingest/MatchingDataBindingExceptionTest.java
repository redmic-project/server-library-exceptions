package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.MatchingDataBindingException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MatchingDataBindingExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "name",
				value= "animal";
		// @formatter:on

		checkMessage(new MatchingDataBindingException(field, value, null), ExceptionType.DTO_FIELD_NOT_VALID.toString(),
				Arrays.asList(field, value));
	}
}
