package es.redmic.test.unit.exception.elasticsearch;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.elasticsearch.ESCreateMappingException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class ESCreateMappingExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		String index = "vessels";

		checkMessage(new ESCreateMappingException(index), ExceptionType.ES_CREATE_MAPPING_ERROR.toString(),
				Arrays.asList(index));
	}
}
