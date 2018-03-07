package com.training.patterns.structural.decorator;

public abstract class KahveEkMalzeme extends Kahve {

	private Kahve kahve;

	public KahveEkMalzeme(final Kahve kahve, final String bilgi, final double fiyat) {
		super(bilgi,
		      fiyat);
		this.kahve = kahve;
	}

	@Override
	public String getBilgi() {
		return this.kahve.getBilgi() + "-" + this.bilgi;
	}

	@Override
	public double fiyat() {
		return this.kahve.fiyat() + this.fiyat;
	}

}
