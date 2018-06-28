package es.redmic.test.unit.exception.mediastorage;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.mediastorage.MSFileUploadNumberFilesExceededException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MSFileUploadNumberFilesExceededExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String expected = "1",
			received = "2";
		// @formatter:on

		checkMessage(new MSFileUploadNumberFilesExceededException(expected, received),
				ExceptionType.FILE_UPLOAD_NUMBER_FILES_EXCEEDED.toString(), Arrays.asList(expected, received));
	}
}