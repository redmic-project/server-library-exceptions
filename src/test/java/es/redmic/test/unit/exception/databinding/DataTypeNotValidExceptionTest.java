package es.redmic.test.unit.exception.databinding;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.databinding.DataTypeNotValidException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DataTypeNotValidExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new DataTypeNotValidException(), ExceptionType.DATA_TYPE_NOT_VALID.toString(), null);
	}
}
