package com.training.patterns.behavioral.observer;

public class RunLisener {
	public static void main(final String[] args) {

		Regiterer.test();

		Event event = new Event();
		event.setStr("test event");
		ObserverController.getInstance()
		                  .fireEvent(event);
	}
}
