package com.training.patterns.behavioral.state;

public class StateRun {
	public static void main(final String[] args) {
		StateContext.getInstance()
		            .write("osman1");
		StateContext.getInstance()
		            .write("osman2");
		StateContext.getInstance()
		            .write("osman3");
		StateContext.getInstance()
		            .write("osman4");
		StateContext.getInstance()
		            .write("osman5");
		StateContext.getInstance()
		            .write("osman6");
	}
}
