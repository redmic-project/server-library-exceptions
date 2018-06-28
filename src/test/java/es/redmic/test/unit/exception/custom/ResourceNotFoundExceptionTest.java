package es.redmic.test.unit.exception.custom;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.custom.ResourceNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ResourceNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new ResourceNotFoundException(), ExceptionType.RESOURCE_NOT_FOUND.toString(), null);
	}
}