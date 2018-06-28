package es.redmic.test.unit.exception.mediastorage;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.mediastorage.MSFileUploadException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class MSFileUploadExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new MSFileUploadException(null), ExceptionType.FILE_UPLOAD.toString(), null);
	}
}
