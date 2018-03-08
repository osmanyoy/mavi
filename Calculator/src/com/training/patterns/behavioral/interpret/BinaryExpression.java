package com.training.patterns.behavioral.interpret;

public class BinaryExpression implements IExpression {

	@Override
	public void interpret(final InterpretContext ic) {
		if (ic.getInput()
		      .startsWith("bin")) {
			String substring = ic.getInput()
			                     .substring(3,
			                                ic.getInput()
			                                  .length());
			substring += "B";
			ic.setOutput(substring);
		}
	}

}
