package com.ws.rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.ws.WebFault;

@WebFault
public class MyException extends Exception {

	private static final long serialVersionUID = 7508646450359899276L;
	
	private MyError myError;

	public MyException(MyError error) {
		this.setMyError(error);
	}

	public MyError getMyError() {
		return myError;
	}

	public void setMyError(MyError myError) {
		this.myError = myError;
	}
	
}
