package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESHistogramIntervalQueryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESHistogramIntervalQueryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String interval = "1d";

		checkMessage(new ESHistogramIntervalQueryException(interval),
				ExceptionType.ES_HISTOGRAM_INTERVAL_QUERY_ERROR.toString(), Arrays.asList(interval));
	}
}
