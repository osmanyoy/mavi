package com.training.patterns.structural.decorator;

public class Run {
	public static void main(final String[] args) {
		Kahve kahve = new Seker(new Sut(new TurkKahvesi()));
		System.out.println(kahve.getBilgi() + " " + kahve.fiyat());
	}
}
