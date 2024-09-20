package org.example.api;

import org.apiguardian.api.*;
import org.example.utilities.*;

@API(status = API.Status.EXPERIMENTAL)
public class ExampleAPI {

	public String sayHelloTo(String to) {
		return StringUtils.join("Hello", "from", "ExampleAPI", "to" , to);
	}
}
