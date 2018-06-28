package es.redmic.exception.mediastorage;

import java.util.Arrays;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class MSFileUploadNumberFilesExceededException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileUploadNumberFilesExceededException(String expected, String received) {

		super(ExceptionType.FILE_UPLOAD_NUMBER_FILES_EXCEEDED);
		setFieldErrors(Arrays.asList(expected, received));
	}
}