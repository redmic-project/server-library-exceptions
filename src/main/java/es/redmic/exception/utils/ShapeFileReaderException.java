package es.redmic.exception.utils;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class ShapeFileReaderException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ShapeFileReaderException() {
		this(null);
	}

	public ShapeFileReaderException(Exception e) {
		super(ExceptionType.SHAPE_FILE_READER_ERROR, e);
	}
}
