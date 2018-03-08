package com.training.patterns.behavioral.state;

public class StateA implements IState {
	public StateA() {
	}

	@Override
	public void write(final String str) {
		System.out.println(str.toLowerCase());
		StateContext.getInstance()
		            .setState(new StateB());
	}

}
