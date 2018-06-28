package es.redmic.test.unit.exception.data;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.data.DeleteItemException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DeleteItemExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new DeleteItemException(), ExceptionType.DELETE_ITEM_EXCEPTION.toString(), null);
	}
}
