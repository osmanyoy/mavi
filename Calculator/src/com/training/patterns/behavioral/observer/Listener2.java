package com.training.patterns.behavioral.observer;

public class Listener2 implements IListener {

	public Listener2() {
		ObserverController.getInstance()
		                  .register(this);
	}

	@Override
	public void handle(final Event event) {
		System.out.println("Listener2 eventi aldı");
	}

}
