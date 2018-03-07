package com.training.patterns.structural.decorator;

public class Seker extends KahveEkMalzeme {

	public Seker(final Kahve kahve) {
		super(kahve,
		      "Şeker",
		      0.1);
	}

}
