package com.training.patterns.behavioral.chainofresponsibility;

public class HandleMore100 extends AbstractHandler {

	public HandleMore100(final IHandle nextHandler) {
		super(nextHandler);
	}

	@Override
	public void handleRequest(final Request request) {
		if (request.getSayi() > 100) {
			System.out.println("100 den büyük girdiniz");
		} else {
			this.next(request);
		}
	}

}
