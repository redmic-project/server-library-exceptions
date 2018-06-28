package es.redmic.exception.mediastorage;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class MSFileNotSupportedException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileNotSupportedException(String expected, String received) {

		super(ExceptionType.FILE_NOT_SUPPORT);
		setFieldErrors(Arrays.asList(expected, received));
	}
}