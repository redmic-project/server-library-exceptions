package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESNotExistsTypeException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESNotExistsTypeExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String index = "taxons",
				type = "animal";
		// @formatter:on

		checkMessage(new ESNotExistsTypeException(index, type), ExceptionType.ES_NOT_EXISTS_TYPE.toString(),
				Arrays.asList(index, type));
	}
}