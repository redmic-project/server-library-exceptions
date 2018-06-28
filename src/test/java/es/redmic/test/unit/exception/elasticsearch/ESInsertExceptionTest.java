package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESInsertException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESInsertExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off

		String field = "aphia",
				value = "23233";
		
		// @formatter:on

		checkMessage(new ESInsertException(field, value), ExceptionType.ES_INSERT_DOCUMENT.toString(),
				Arrays.asList(field, value));
	}
}