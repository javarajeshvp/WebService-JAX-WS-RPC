package com.vp.webservice.soap.jaxwsrpc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface IHelloWorld {
	@WebMethod
	public String sayHello(String name);
}
