package es.redmic.test.unit.exception.atlas;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import es.redmic.exception.atlas.LayerNotFoundException;
import es.redmic.exception.common.ExceptionType;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class LayerNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String layer = "batimetria",
				url = "https://atlas.redmic.es/geoserver/sd/wms";
		// @formatter:on

		checkMessage(new LayerNotFoundException(layer, url), ExceptionType.LAYER_NOT_FOUND.toString(),
				Arrays.asList(layer, url));
	}
}
