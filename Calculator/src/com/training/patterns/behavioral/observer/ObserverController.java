package com.training.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverController {
	private static volatile ObserverController instance;

	private List<IListener> listeners = new ArrayList<>();

	private ObserverController() {
	}

	public void register(final IListener listener) {
		this.listeners.add(listener);
	}

	public void fireEvent(final Event event) {
		for (IListener iListener : this.listeners) {
			iListener.handle(event);
		}
	}

	public static ObserverController getInstance() {
		if (ObserverController.instance == null) {
			synchronized (ObserverController.class) {
				if (ObserverController.instance == null) {
					ObserverController.instance = new ObserverController();
				}
			}
		}
		return ObserverController.instance;
	}

}
