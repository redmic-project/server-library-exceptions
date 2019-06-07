package es.redmic.test.unit.exception.custom;

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
import es.redmic.exception.custom.URLException;
import es.redmic.test.unit.exception.common.BaseExceptionTest;

public class URLExceptionTest extends BaseExceptionTest {

	String url = "ht://www.marinespecies.org/rest/AphiaClassificationByAphiaID/3";

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSet() throws IOException {

		checkMessage(new URLException(url), ExceptionType.URL_EXCEPTION.toString(), Arrays.asList(url));
	}

	@Test
	public void checkPattern_IsEqualToMessage_WhenNoLocaleSetAndSendException() throws IOException {

		checkMessage(new URLException(new Exception(), url), ExceptionType.URL_EXCEPTION.toString(),
				Arrays.asList(url));
	}
}
