package com.training.patterns.behavioral.template;

public class HTMLMessage extends AbstarctMessageBuilder {

	@Override
	public String header() {
		return "<html>";
	}

	@Override
	public String body() {
		return "<body></body>";
	}

	@Override
	public String footer() {
		return "/<html>";
	}

}
