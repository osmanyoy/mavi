package com.training.patterns.behavioral.chainofresponsibility;

public class HandlerFactory {
	public static IHandle getHandler() {
		return new HandleMore100(new HandlePositive(new HandleNegative(new HandleZero(null))));
	}
}
