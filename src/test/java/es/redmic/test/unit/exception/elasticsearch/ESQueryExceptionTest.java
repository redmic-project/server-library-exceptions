package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESQueryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESQueryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESQueryException(), ExceptionType.ES_QUERY_ERROR.toString(), null);
	}
}