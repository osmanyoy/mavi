package com.training.patterns.behavioral.observer;

public class Listener4 implements IListener {

	public Listener4() {
		ObserverController.getInstance()
		                  .register(this);
	}

	@Override
	public void handle(final Event event) {
		System.out.println("Listener4 eventi aldı");
	}

}
