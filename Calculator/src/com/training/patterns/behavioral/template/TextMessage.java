package com.training.patterns.behavioral.template;

public class TextMessage extends AbstarctMessageBuilder {

	@Override
	public String header() {
		return "header";
	}

	@Override
	public String body() {
		return "body";
	}

	@Override
	public String footer() {
		return "footer";
	}

}
