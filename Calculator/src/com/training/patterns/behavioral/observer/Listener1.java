package com.training.patterns.behavioral.observer;

public class Listener1 implements IListener {

	public Listener1() {
		ObserverController.getInstance()
		                  .register(this);
	}

	@Override
	public void handle(final Event event) {
		System.out.println("Listener1 eventi aldı");
	}

}
