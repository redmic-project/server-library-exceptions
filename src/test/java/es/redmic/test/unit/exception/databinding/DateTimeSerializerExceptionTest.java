package es.redmic.test.unit.exception.databinding;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.databinding.DateTimeSerializerException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DateTimeSerializerExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String format = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ",
				dateTime = "12/01/2001 23:00:00";
		// @formatter:on

		checkMessage(new DateTimeSerializerException(format, dateTime),
				ExceptionType.SERIALIZE_DATETIME_ERROR.toString(), Arrays.asList(format, dateTime));
	}
}
