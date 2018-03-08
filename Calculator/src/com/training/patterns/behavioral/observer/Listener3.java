package com.training.patterns.behavioral.observer;

public class Listener3 implements IListener {

	public Listener3() {
		ObserverController.getInstance()
		                  .register(this);
	}

	@Override
	public void handle(final Event event) {
		System.out.println("Listener3 eventi aldı");
	}

}
