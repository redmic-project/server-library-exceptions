package es.redmic.test.unit.exception.tasks.ingest;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.tasks.ingest.IngestMatchingGeometryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class IngestMatchingGeometryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new IngestMatchingGeometryException("Point", "Multipolygon | Polygon", null),
				ExceptionType.INGEST_MATCHING_GEOMETRY.toString(), Arrays.asList("Point", "Multipolygon | Polygon"));
	}
}
