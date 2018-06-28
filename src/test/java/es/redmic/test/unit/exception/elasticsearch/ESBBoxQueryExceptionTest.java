package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESBBoxQueryException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESBBoxQueryExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESBBoxQueryException(new Exception()), ExceptionType.ES_BBOX_QUERY_ERROR.toString(), null);
	}
}