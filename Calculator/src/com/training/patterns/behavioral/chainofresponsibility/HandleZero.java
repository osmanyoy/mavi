package com.training.patterns.behavioral.chainofresponsibility;

public class HandleZero extends AbstractHandler {

	public HandleZero(final IHandle nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(final Request request) {
		if (request.getSayi() == 0) {
			System.out.println("Sýfýr girdiniz");
		} else {
			this.next(request);
		}
	}

}
