package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESTooManySelectedItemsException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESTooManySelectedItemsExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ESTooManySelectedItemsException(), ExceptionType.ES_TOO_MANY_SELECTED_ITEMS.toString(), null);
	}
}