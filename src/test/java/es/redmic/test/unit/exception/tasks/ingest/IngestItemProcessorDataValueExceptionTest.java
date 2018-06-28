package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestItemProcessorDataValueException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestItemProcessorDataValueExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestItemProcessorDataValueException(null),
				ExceptionType.ITEM_PROCESSOR_DATA_VALUE_EXCEPTION.toString(), null);
	}
}
