package com.training.patterns.behavioral.template;

public class MessageBuilder {

	public String createMessage(final String footer, final String body, final String header) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(header);
		stringBuilder.append(body);
		stringBuilder.append(footer);
		return stringBuilder.toString();
	}

	public String createMessageHTML(final String footer, final String body, final String header) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("<html>");
		stringBuilder.append(header);
		stringBuilder.append("<body>");
		stringBuilder.append(body);
		stringBuilder.append("</body>");
		stringBuilder.append(footer);
		stringBuilder.append("</html>");
		return stringBuilder.toString();
	}
}
