package es.redmic.exception.utils;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class DecompressException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public DecompressException() {
		this(null);
	}

	public DecompressException(Exception e) {
		super(ExceptionType.DECOMPRESS_ERROR, e);
	}
}
