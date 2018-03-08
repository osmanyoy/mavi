package com.training.patterns.behavioral.interpret;

import java.util.Scanner;

public class ExpressionRun {
	public static void main(final String[] args) {

		IExpression expression = ExpressionFactory.getExpression();
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		InterpretContext ic = new InterpretContext();
		ic.setInput(nextLine);
		expression.interpret(ic);
		System.out.println(ic.getOutput());
	}
}
