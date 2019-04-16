package es.redmic.test.unit.exception.database;

/*-
 * #%L
 * Exceptions
 * %%
 * Copyright (C) 2019 REDMIC Project / Server
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

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
