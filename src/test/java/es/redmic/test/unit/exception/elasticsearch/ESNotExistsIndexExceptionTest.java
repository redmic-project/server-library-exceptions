package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESNotExistsIndexException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESNotExistsIndexExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String index = "taxons";

		checkMessage(new ESNotExistsIndexException(index), ExceptionType.ES_NOT_EXISTS_INDEX.toString(),
				Arrays.asList(index));
	}
}
