package com.training.patterns.behavioral.template;

public abstract class AbstarctMessageBuilder {

	public abstract String header();

	public abstract String body();

	public abstract String footer();

	public String createMessage() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.header());
		stringBuilder.append(this.body());
		stringBuilder.append(this.footer());
		return stringBuilder.toString();

	}

}
