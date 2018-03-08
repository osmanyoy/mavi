package com.training.patterns.behavioral.chainofresponsibility;

public class HandleNegative extends AbstractHandler {

	public HandleNegative(final IHandle nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(final Request request) {
		if (request.getSayi() < 0) {
			System.out.println("Negatif sayý girdiniz");
		} else {
			this.next(request);
		}
	}

}
