package es.redmic.exception.custom;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.NotFoundException;

public class ResourceNotFoundException extends NotFoundException {

	private static final long serialVersionUID = 3658782399097632577L;

	public ResourceNotFoundException() {
		this(null);
	}

	public ResourceNotFoundException(Exception e) {
		super(ExceptionType.RESOURCE_NOT_FOUND, e);
	}
}