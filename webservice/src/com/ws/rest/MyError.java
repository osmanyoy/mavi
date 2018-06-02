package com.ws.rest;

import javax.xml.bind.annotation.XmlRootElement;

public class MyError {
	private int cause;
	private String msg;

	public int getCause() {
		return cause;
	}

	public void setCause(int cause) {
		this.cause = cause;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
