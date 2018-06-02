package com.ws.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.activation.DataSource;

public class MyDataSource implements DataSource{
	
	private String fileName;

	public MyDataSource(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String getContentType() {
		return "application/octet-stream";
	}

	@Override
	public InputStream getInputStream() throws IOException {
		Path path = Paths.get("d:/files");
		Path resolve = path.resolve(fileName);
		File file = resolve.toFile();
		FileInputStream fileInputStream = new FileInputStream(file);
		return fileInputStream;
	}

	@Override
	public String getName() {
		return fileName;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
