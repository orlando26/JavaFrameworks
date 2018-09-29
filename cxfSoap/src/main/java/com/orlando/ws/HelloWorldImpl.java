
package com.orlando.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.orlando.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public int sum(int a, int b) {
		return a + b;
	}
}

