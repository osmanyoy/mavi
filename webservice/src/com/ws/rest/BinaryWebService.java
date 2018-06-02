package com.ws.rest;

import java.io.IOException;
import java.io.InputStream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService
@MTOM
public class BinaryWebService {
	
	public DataHandler downloadData(String filename) {
		DataHandler dataHandler = new DataHandler(new MyDataSource(filename));
		return dataHandler;
	}

	public String uploadData(DataHandler dataHandler) {
		byte[] bytes = new byte[1024];
		DataSource dataSource = dataHandler.getDataSource();
		try {
			InputStream inputStream = dataSource.getInputStream();
			int read = inputStream.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "OK";
	}
	
	
}
