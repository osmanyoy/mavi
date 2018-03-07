package com.training.patterns.structural.decorator;

public class Kahve {
	protected String bilgi;
	protected double fiyat;

	public Kahve(final String bilgi, final double fiyat) {
		this.bilgi = bilgi;
		this.fiyat = fiyat;
	}

	public String getBilgi() {
		return this.bilgi;
	}

	public double fiyat() {
		return this.fiyat;
	}

}
