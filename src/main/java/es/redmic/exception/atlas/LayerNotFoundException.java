package es.redmic.exception.atlas;

import java.util.Arrays;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public class LayerNotFoundException extends BaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public LayerNotFoundException(String layer, String url) {
		super(ExceptionType.LAYER_NOT_FOUND);
		setFieldErrors(Arrays.asList(layer, url));
	}
}