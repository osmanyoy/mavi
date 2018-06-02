package com.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;

import com.sun.xml.internal.ws.developer.JAXWSProperties;

public class RunClient {
	public static void main(String[] args) throws Exception {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
		                   "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
		                   "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump",
		                   "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
		                   "true");
		EmployeeWebServiceService service = new EmployeeWebServiceService();

//		EmployeeWebServiceService service = new EmployeeWebServiceService(new URL("http://127.0.0.1:10000/test?wsdl"));
		EmployeeWebService employeeWebServicePort = service.getEmployeeWebServicePort();
		BindingProvider bindingProvider = (BindingProvider) employeeWebServicePort;
		
		Binding binding = bindingProvider.getBinding();
		List<Handler> handlerChain = binding.getHandlerChain();
		handlerChain.add(new MyClientHandler());
		binding.setHandlerChain(handlerChain);
		
		Map<String, Object> requestContext = bindingProvider.getRequestContext();
//		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
//		                   "http://127.0.0.1:10000/test");
		requestContext.put(JAXWSProperties.CONNECT_TIMEOUT,
		                   100000);
		requestContext.put(JAXWSProperties.REQUEST_TIMEOUT,
		                   100000);

		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS,
		                   Collections.singletonMap("Authorization",
		                                            Collections.singletonList("Basic "
		                                                                      + new String(Base64.getEncoder()
		                                                                                         .encode("osman:password".getBytes())))));
		try {
			Employee employee = employeeWebServicePort.getEmployee(5);
			System.out.println(employee);
		} catch (MyException_Exception e) {
			MyException faultInfo = e.getFaultInfo();
			MyError error = faultInfo.getMyError();
			System.out.println(error);
		}
	}
}
