package com.training.patterns.bridge;

public class Navigasyon {

	public int hiz = 10;

	public Navigasyon(final int hiz) {
		this.hiz = hiz;
	}

	public double zamaniHesapla(final int km) {
		return ((double) km / (double) this.hiz);
	}

}
