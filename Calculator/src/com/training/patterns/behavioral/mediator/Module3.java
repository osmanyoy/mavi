package com.training.patterns.behavioral.mediator;

import com.training.patterns.behavioral.observer.Event;
import com.training.patterns.behavioral.observer.IListener;

public class Module3 implements IListener {

	@Override
	public void handle(final Event event) {
		System.out.println("Module3 event handle");
	}

}
