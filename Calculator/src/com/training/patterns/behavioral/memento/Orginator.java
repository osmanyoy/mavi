package com.training.patterns.behavioral.memento;

public class Orginator {
	private static volatile Orginator instance;

	private Orginator() {
	}

	public static Orginator getInstance() {
		if (Orginator.instance == null) {
			synchronized (Orginator.class) {
				if (Orginator.instance == null) {
					Orginator.instance = new Orginator();
				}
			}
		}
		return Orginator.instance;
	}

	private String stateStr;

	public Memento createSnapShot() {
		Memento memento = new Memento();
		memento.setState(this.getStateStr());
		Caretaker.getInstance()
		         .addState(memento);
		return memento;
	}

	public void returnState(final int index) {
		Memento state = Caretaker.getInstance()
		                         .getState(index);
		this.setStateStr(state.getState());
	}

	public String getStateStr() {
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

}
