package es.redmic.exception.mediastorage;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class MSFileUploadNotFoundException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileUploadNotFoundException() {
		this(null);
	}

	public MSFileUploadNotFoundException(Exception e) {
		super(ExceptionType.FILE_UPLOAD_NOT_FOUND, e);
	}
}