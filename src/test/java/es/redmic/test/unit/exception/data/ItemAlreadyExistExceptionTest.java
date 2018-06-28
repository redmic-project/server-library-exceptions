package es.redmic.test.unit.exception.data;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.data.ItemAlreadyExistException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ItemAlreadyExistExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ItemAlreadyExistException(), ExceptionType.ITEM_ALREADY_EXIST_EXCEPTION.toString(), null);
	}
}
