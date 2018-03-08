package com.training.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private static volatile Caretaker instance;

	private Caretaker() {
	}

	public static Caretaker getInstance() {
		if (Caretaker.instance == null) {
			synchronized (Caretaker.class) {
				if (Caretaker.instance == null) {
					Caretaker.instance = new Caretaker();
				}
			}
		}
		return Caretaker.instance;
	}

	private List<Memento> states = new ArrayList<>();

	public void addState(final Memento memento) {
		this.states.add(memento);
	}

	public Memento getState(final int index) {
		return this.states.get(index);
	}

}
