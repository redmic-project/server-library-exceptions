package es.redmic.test.unit.exception.database;

import java.io.IOException;
import java.util.Arrays;

import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.database.DBPropertyValueException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DBPropertyValueExceptionTest extends BaseExceptionTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		validator = factory.getValidator();
	}

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "url",
			message = "no puede ser null";
		// @formatter:on

		ConstraintViolationException ex = new ConstraintViolationException(validator.validate(new test()));
		checkMessage(new DBPropertyValueException(ex), ExceptionType.DB_PROPERTY_ERROR.toString(),
				Arrays.asList(field, message));
	}

	public class test {

		@NotNull
		private String url;
	}
}
