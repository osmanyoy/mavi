package com.training.patterns.behavioral.state;

public class StateContext implements IState {
	private static volatile StateContext instance;

	private StateContext() {
	}

	public static StateContext getInstance() {
		if (StateContext.instance == null) {
			synchronized (StateContext.class) {
				if (StateContext.instance == null) {
					StateContext.instance = new StateContext();
					StateContext.instance.state = new StateA();
				}
			}
		}
		return StateContext.instance;
	}

	private IState state;

	@Override
	public void write(final String str) {
		this.getState()
		    .write(str);
	}

	public IState getState() {
		return this.state;
	}

	public void setState(final IState state) {
		this.state = state;
	}

}
