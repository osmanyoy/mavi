package com.training.patterns.behavioral.chainofresponsibility;

public class HandlePositive extends AbstractHandler {

	public HandlePositive(final IHandle nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(final Request request) {
		if (request.getSayi() > 0) {
			System.out.println("Pozitif sayý girdiniz");
		} else {
			this.next(request);
		}
	}

}
