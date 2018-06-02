package com.ws.client.binary;

public class BinaryClient {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
		                   "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
		                   "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump",
		                   "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
		                   "true");

		BinaryWebServiceService service = new BinaryWebServiceService();
		BinaryWebService binaryWebServicePort = service.getBinaryWebServicePort();
		byte[] downloadData = binaryWebServicePort.downloadData("test.jpg");
		System.out.println(downloadData);
	}
}
