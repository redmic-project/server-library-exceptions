package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestMatchingDataDefinitionException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestMatchingDataDefinitionExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestMatchingDataDefinitionException(null),
				ExceptionType.INGEST_MATCHING_DATADEFINITION_CONSTRAINTS.toString(), null);
	}
}
