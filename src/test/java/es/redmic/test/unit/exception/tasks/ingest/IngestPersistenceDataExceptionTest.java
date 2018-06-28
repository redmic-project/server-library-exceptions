package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestPersistenceDataException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestPersistenceDataExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestPersistenceDataException(null),
				ExceptionType.INGEST_PERSISTENCE_DATA_EXCEPTION.toString(), null);
	}
}
