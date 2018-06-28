package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESSelectionWorkException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESSelectionWorkExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESSelectionWorkException(null), ExceptionType.ES_SELECTION_WORK.toString(), null);
	}
}