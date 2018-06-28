package es.redmic.test.unit.exception.mediastorage;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.mediastorage.MSFileNotSupportedException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MSFileNotSupportedExceptionTest extends BaseExceptionTest {

	// @formatter:off
	String expected = "image/png",
		received = "application/pdf";
	// @formatter:on

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new MSFileNotSupportedException(expected, received), ExceptionType.FILE_NOT_SUPPORT.toString(),
				Arrays.asList(expected, received));
	}
}
