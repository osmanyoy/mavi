package com.training.patterns.behavioral.interpret;

import java.util.ArrayList;
import java.util.List;

public class ExpressionClient implements IExpression {
	private List<IExpression> expres = new ArrayList<>();

	public void addExpression(final IExpression expression) {
		this.expres.add(expression);
	}

	@Override
	public void interpret(final InterpretContext ic) {
		for (IExpression iExpression : this.expres) {
			iExpression.interpret(ic);
		}
	}

}
