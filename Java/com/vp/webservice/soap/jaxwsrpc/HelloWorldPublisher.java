package com.vp.webservice.soap.jaxwsrpc;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String arg[]){
		Endpoint.publish(URLConstants.SOAP_JAXWS_RPC_URL, new HelloWorldImpl());
		System.out.println("Hello Worls JAX-WS RPC Service is running.. ");
	}
}
