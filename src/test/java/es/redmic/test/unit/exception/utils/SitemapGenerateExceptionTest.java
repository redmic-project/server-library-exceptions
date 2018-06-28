package es.redmic.test.unit.exception.utils;

import java.io.IOException;

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.utils.SitemapGenerateException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class SitemapGenerateExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new SitemapGenerateException(), ExceptionType.GENERATE_SITEMAP.toString(), null);
	}
}
