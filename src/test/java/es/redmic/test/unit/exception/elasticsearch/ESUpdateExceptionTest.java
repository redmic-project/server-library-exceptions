package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESUpdateException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESUpdateExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESUpdateException("Fallo por problema de conexión"),
				ExceptionType.ES_UPDATE_DOCUMENT.toString(), null);
	}
}