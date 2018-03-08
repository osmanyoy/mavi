package com.training.patterns.behavioral.template;

public class TemplateRun {
	public static void main(final String[] args) {
		AbstarctMessageBuilder messageBuilder = MessageFactory.getMessageBuilder(2);
		String createMessage = messageBuilder.createMessage();
		System.out.println(createMessage);
	}
}
