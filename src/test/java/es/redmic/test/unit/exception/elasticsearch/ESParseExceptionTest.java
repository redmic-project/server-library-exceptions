package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESParseException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESParseExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESParseException(null), ExceptionType.ES_PARSE_ERROR.toString(), null);
	}
}