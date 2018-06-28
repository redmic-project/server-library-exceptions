package es.redmic.exception.security;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.common.MethodNotAllowedException;

public class SecurityConfigurationException extends MethodNotAllowedException {

	private static final long serialVersionUID = 1L;

	public SecurityConfigurationException(Exception e) {

		super(ExceptionType.SECURITY_CONFIGURATION_EXCEPTION, e);
	}
}