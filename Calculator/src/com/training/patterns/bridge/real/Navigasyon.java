package com.training.patterns.bridge.real;

public class Navigasyon {

	private YolTipi yolTipi;

	private int hiz;

	public Navigasyon(final int hiz, final YolTipi yolTipi) {
		this.hiz = hiz;
		this.yolTipi = yolTipi;
	}

	public double zamaniHesapla(final int km) {
		return (km / (this.hiz * this.yolTipi.getCarpan()));
	}

}
