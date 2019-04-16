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

import org.junit.Test;

import es.redmic.exception.common.ExceptionType;
import es.redmic.exception.database.DBNotFoundException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class DBNotFoundExceptionTest extends BaseExceptionTest {

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		// @formatter:off
		String field = "id",
			value = "5";
		// @formatter:on

		checkMessage(new DBNotFoundException(field, value), ExceptionType.DB_NOT_FOUND.toString(),
				Arrays.asList(field, value));
	}
}
