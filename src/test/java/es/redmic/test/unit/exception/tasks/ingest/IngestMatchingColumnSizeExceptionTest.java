package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestMatchingColumnSizeException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestMatchingColumnSizeExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestMatchingColumnSizeException(null),
				ExceptionType.INGEST_MATCHING_SIZE_EXCEPTION.toString(), null);
	}
}
