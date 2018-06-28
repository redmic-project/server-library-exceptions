package es.redmic.exception.mediastorage;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class MSFileUploadException extends BadRequestException {

	private static final long serialVersionUID = 3658782399097632577L;

	public MSFileUploadException(Exception e) {
		super(ExceptionType.FILE_UPLOAD, e);
	}
}