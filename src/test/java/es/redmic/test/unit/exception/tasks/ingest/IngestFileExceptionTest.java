package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestFileException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestFileExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestFileException(null), ExceptionType.INGEST_FILE_EXCEPTION.toString(), null);
	}
}
