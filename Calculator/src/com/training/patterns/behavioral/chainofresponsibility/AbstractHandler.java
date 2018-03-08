package com.training.patterns.behavioral.chainofresponsibility;

public abstract class AbstractHandler implements IHandle {
	private IHandle nextHandler;

	public AbstractHandler(final IHandle nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void next(final Request request) {
		if (this.nextHandler != null) {
			this.nextHandler.handleRequest(request);
		}
	}
}
