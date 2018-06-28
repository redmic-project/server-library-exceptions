package es.redmic.test.unit.exception.taxonomy;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.taxonomy.InvalidAphiaException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class InvalidAphiaExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String ahpia = "12123";

		checkMessage(new InvalidAphiaException(ahpia), ExceptionType.INVALID_APHIA.toString(), Arrays.asList(ahpia));
	}
}
