package com.training.patterns.behavioral.mediator;

import com.training.patterns.behavioral.observer.Event;
import com.training.patterns.behavioral.observer.IListener;

public class MyMessageSendTask implements Runnable {

	private IListener iListener;
	private Event event;

	public MyMessageSendTask(final IListener iListener, final Event event) {
		this.iListener = iListener;
		this.event = event;
	}

	@Override
	public void run() {
		this.iListener.handle(this.event);
	}

}
