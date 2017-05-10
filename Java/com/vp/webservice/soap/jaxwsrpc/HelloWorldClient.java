package com.vp.webservice.soap.jaxwsrpc;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL(URLConstants.SOAP_JAXWS_RPC_URL + "?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://jaxwsrpc.soap.webservice.vp.com/","HelloWorldImplService");

		Service service = Service.create(url, qname);

		IHelloWorld hello = service.getPort(IHelloWorld.class);

		System.out.println(hello.sayHello("Rajesh"));

	}

}
