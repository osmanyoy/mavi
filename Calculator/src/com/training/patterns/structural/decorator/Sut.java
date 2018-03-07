package com.training.patterns.structural.decorator;

public class Sut extends KahveEkMalzeme {

	public Sut(final Kahve kahve) {
		super(kahve,
		      "Süt",
		      0.2);
	}

}
