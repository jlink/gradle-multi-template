package org.example.utilities;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTests {

	@Test
	void joining() {
		String result = StringUtils.join("Hello", "from", "StringUtils");
		assertEquals("Hello from StringUtils", result);
	}
}
