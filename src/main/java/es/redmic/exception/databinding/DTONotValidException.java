package es.redmic.exception.databinding;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import es.redmic.exception.common.BadRequestException;
import es.redmic.exception.common.ExceptionType;

public class DTONotValidException extends BadRequestException {

	private static final long serialVersionUID = 6714485190161856195L;

	public DTONotValidException(BindingResult bindingResult) {
		super(ExceptionType.DTO_NOT_VALID);
		buildException(bindingResult);
	}

	public <T> DTONotValidException(Set<ConstraintViolation<T>> violations) {
		super(ExceptionType.DTO_NOT_VALID);
		buildException(violations);
	}

	public void buildException(BindingResult bindingResult) {

		String msgErrors = "";

		Iterator<FieldError> itr = bindingResult.getFieldErrors().iterator();
		while (itr.hasNext()) {
			FieldError error = itr.next();
			msgErrors = concatError(msgErrors, error.getField(), error.getDefaultMessage());
		}
		if (!msgErrors.isEmpty())
			setFieldErrors(Arrays.asList(msgErrors));
	}

	public <T> void buildException(Set<ConstraintViolation<T>> violations) {

		String msgErrors = "";

		for (ConstraintViolation<?> violation : violations) {
			msgErrors = concatError(msgErrors, violation.getPropertyPath().toString(), violation.getMessage());
		}

		if (!msgErrors.isEmpty())
			setFieldErrors(Arrays.asList(msgErrors));
	}

	private String concatError(String msg, String path, String error) {
		return msg + " " + path + ": " + error + "; ";
	}
}
