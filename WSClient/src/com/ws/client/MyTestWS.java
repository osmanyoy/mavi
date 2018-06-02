package com.ws.client;

import javax.xml.ws.Endpoint;

public class MyTestWS {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:10000/test", new MyTestClass());
	}
}
