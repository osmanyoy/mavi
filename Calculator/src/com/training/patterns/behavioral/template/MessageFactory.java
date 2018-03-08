package com.training.patterns.behavioral.template;

public class MessageFactory {
	public static AbstarctMessageBuilder getMessageBuilder(final int type) {
		switch (type) {
		case 1:
			return new TextMessage();
		case 2:
			return new HTMLMessage();

		default:
			return new TextMessage();
		}
	}
}
