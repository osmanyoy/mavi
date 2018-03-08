package com.training.patterns.behavioral.command;

public class RequestObj implements Cloneable {
	private String str;

	public String getStr() {
		return this.str;
	}

	public void setStr(final String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "RequestObj [str=" + this.str + "]";
	}

}
