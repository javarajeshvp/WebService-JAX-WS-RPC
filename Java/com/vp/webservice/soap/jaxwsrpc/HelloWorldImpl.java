package com.vp.webservice.soap.jaxwsrpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.vp.webservice.soap.jaxwsrpc.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld{

	@Override
	public String sayHello(String name) {

		System.out.println("HelloWorldImpl.sayHello() called.");
		return "Hello Mr. " + name;
	}

}
