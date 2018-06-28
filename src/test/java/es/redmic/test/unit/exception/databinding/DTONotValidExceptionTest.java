package es.redmic.test.unit.exception.databinding;

import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

import org.junit.Test;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.databinding.DTONotValidException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DTONotValidExceptionTest extends BaseExceptionTest {

	String msg = " url: no puede ser null; ";

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSetAndSendBindingResult() throws IOException {

		BindingResult bindingResult = new BeanPropertyBindingResult(new test(), "url");
		bindingResult.rejectValue("url", "NotNull", "no puede ser null");

		checkMessage(new DTONotValidException(bindingResult), ExceptionType.DTO_NOT_VALID.toString(),
				Arrays.asList(msg));
	}

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSetAndSend() throws IOException {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<test>> violations = validator.validate(new test());

		checkMessage(new DTONotValidException(violations), ExceptionType.DTO_NOT_VALID.toString(), Arrays.asList(msg));
	}

	public class test {

		@NotNull
		private String url;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
}
