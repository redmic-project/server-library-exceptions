package es.redmic.test.unit.exception.utils;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.ShapeFileReaderException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ShapeFileReaderExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ShapeFileReaderException(), ExceptionType.SHAPE_FILE_READER_ERROR.toString(), null);
	}
}
