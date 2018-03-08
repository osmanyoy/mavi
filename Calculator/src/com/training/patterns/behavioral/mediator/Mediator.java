package com.training.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.training.patterns.behavioral.observer.Event;
import com.training.patterns.behavioral.observer.IListener;

public class Mediator {
	private static volatile Mediator instance;

	private ExecutorService newFixedThreadPool;

	private Mediator() {
	}

	public static Mediator getInstance() {
		if (Mediator.instance == null) {
			synchronized (Mediator.class) {
				if (Mediator.instance == null) {
					Mediator.instance = new Mediator();
					Mediator.instance.newFixedThreadPool = Executors.newFixedThreadPool(10);
				}
			}
		}
		return Mediator.instance;
	}

	private Map<String, IListener> listenerMap = new HashMap<>();

	public void sendEvent(final IListener listener, final Event event) {
		for (IListener iListener : this.listenerMap.values()) {
			if (iListener != listener) {
				this.newFixedThreadPool.execute(new MyMessageSendTask(iListener,
				                                                      event));
			}
		}
	}

	public void sendEvent(final IListener listener, final String destination, final Event event) {
		IListener iListener = this.listenerMap.get(destination);
		this.newFixedThreadPool.execute(new MyMessageSendTask(iListener,
		                                                      event));
	}

	public void register(final String name, final IListener listener) {
		this.listenerMap.put(name,
		                     listener);
	}

}
