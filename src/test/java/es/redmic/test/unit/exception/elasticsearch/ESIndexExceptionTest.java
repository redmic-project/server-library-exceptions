package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESIndexException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESIndexExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESIndexException(), ExceptionType.ES_INDEX_DOCUMENT.toString(), null);
	}
}