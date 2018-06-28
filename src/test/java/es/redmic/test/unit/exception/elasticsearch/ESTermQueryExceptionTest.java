package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESTermQueryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESTermQueryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String term = "taxons",
				value = "animal";
		// @formatter:on

		checkMessage(new ESTermQueryException(term, value), ExceptionType.ES_TERM_QUERY_ERROR.toString(),
				Arrays.asList(term, value));
	}
}