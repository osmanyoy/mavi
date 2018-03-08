package com.training.patterns.behavioral.memento;

public class MementoRun {
	public static void main(final String[] args) {
		Orginator.getInstance()
		         .setStateStr("State1");
		Orginator.getInstance()
		         .createSnapShot();
		Orginator.getInstance()
		         .setStateStr("State2");
		Orginator.getInstance()
		         .createSnapShot();
		Orginator.getInstance()
		         .setStateStr("State3");
		Orginator.getInstance()
		         .createSnapShot();
		Orginator.getInstance()
		         .setStateStr("State4");
		Orginator.getInstance()
		         .returnState(2);
		System.out.println(Orginator.getInstance()
		                            .getStateStr());
	}
}
