package com.training.patterns.behavioral.state;

public class StateB implements IState {
	public StateB() {
	}

	@Override
	public void write(final String str) {
		System.out.println(str.toUpperCase());
		StateContext.getInstance()
		            .setState(new StateA());
	}

}
