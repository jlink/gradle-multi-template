package org.example.api;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ExampleApiTests {

	@Test
	void sayHelloCall() {
		ExampleAPI api = new ExampleAPI();
		String result = api.sayHelloTo("World");
		assertEquals("Hello from ExampleAPI to World", result);
	}
 }
