package es.redmic.exception.handler;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

import es.redmic.exception.common.BaseException;
import es.redmic.exception.dto.ErrorDTO;

public abstract class BaseExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	// @formatter:off
	
	private String id = UUID.randomUUID().toString(),
			defaultMessageProperty = "DefaultMessage";
	
	// @formatter:on

	Locale locale = LocaleContextHolder.getLocale();

	protected ErrorDTO getError(BaseException e) {

		String msg = getLocalizedMessage(e);
		printLog(e, msg);
		return new ErrorDTO(msg, id);
	}

	public String getLocalizedMessage(BaseException e) {

		String mess = getMessage(e.getCode().toString(), e.getFieldErrors(), locale);

		if (mess == null)
			mess = e.getMessage();

		return mess + " " + getMessage(defaultMessageProperty, null, locale);
	}

	private String getMessage(String code, List<String> args, Locale locale) {

		if (messageSource == null)
			return null;

		try {
			return messageSource.getMessage(code, (args != null ? args.toArray() : null), locale);
		} catch (Exception e) {
			return code;
		}
	}

	public void printLog(BaseException e, String msg) {

		String error = "\n Code: " + id;

		if (e.getSource() != null) {
			error += ".\n StrackTrace: " + e.getSource().getMessage();
			e.getSource().printStackTrace();
		}
		error += ".\n Message: " + msg;
		System.out.println(error);
	}
}