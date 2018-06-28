package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestItemProcessorGeometryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestItemProcessorGeometryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestItemProcessorGeometryException(null),
				ExceptionType.ITEM_PROCESSOR_GEOMETRY_EXCEPTION.toString(), null);
	}
}
