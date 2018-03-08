package com.training.patterns.behavioral.interpret;

public class ExpressionFactory {

	public static IExpression getExpression() {
		ExpressionClient client = new ExpressionClient();
		client.addExpression(new HexExpression());
		client.addExpression(new BinaryExpression());
		return client;
	}

}
