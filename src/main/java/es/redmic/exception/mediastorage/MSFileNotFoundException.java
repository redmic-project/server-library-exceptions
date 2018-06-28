package es.redmic.exception.mediastorage;

import java.util.Arrays;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.common.ExceptionType;

public class MSFileNotFoundException extends BaseException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileNotFoundException(String fileName) {

		this(fileName, null);
	}

	public MSFileNotFoundException(String filename, String path) {

		this(filename, path, null);
	}

	public MSFileNotFoundException(String filename, String path, Exception e) {

		super(ExceptionType.FILE_NOT_FOUND, e);
		setFieldErrors(Arrays.asList(filename, path));
	}
}
