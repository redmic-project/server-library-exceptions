package es.redmic.test.unit.exception.mediastorage;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.mediastorage.MSFileUploadNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MSFileUploadNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new MSFileUploadNotFoundException(null), ExceptionType.FILE_UPLOAD_NOT_FOUND.toString(), null);
	}
}
