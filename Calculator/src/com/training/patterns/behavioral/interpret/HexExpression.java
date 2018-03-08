package com.training.patterns.behavioral.interpret;

public class HexExpression implements IExpression {

	@Override
	public void interpret(final InterpretContext ic) {
		if (ic.getInput()
		      .startsWith("hex")) {
			String substring = ic.getInput()
			                     .substring(3,
			                                ic.getInput()
			                                  .length());
			substring += "H";
			ic.setOutput(substring);
		}
	}

}
