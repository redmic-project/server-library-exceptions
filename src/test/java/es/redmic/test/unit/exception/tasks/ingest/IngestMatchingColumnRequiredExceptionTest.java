package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestMatchingColumnRequiredException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestMatchingColumnRequiredExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String columns = "geometry";

		checkMessage(new IngestMatchingColumnRequiredException(null, columns),
				ExceptionType.INGEST_MATCHING_COLUMN_REQUIRED_EXCEPTION.toString(), Arrays.asList(columns));
	}
}
