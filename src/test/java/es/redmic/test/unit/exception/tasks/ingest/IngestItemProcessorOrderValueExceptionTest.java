package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestItemProcessorOrderValueException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestItemProcessorOrderValueExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestItemProcessorOrderValueException(null),
				ExceptionType.ITEM_PROCESSOR_ORDER_EXCEPTION.toString(), null);
	}
}
