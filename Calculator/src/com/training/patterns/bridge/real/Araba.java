package com.training.patterns.bridge.real;

public class Araba extends Navigasyon {
	public Araba(final YolTipi yolTipi) {
		super(100,
		      yolTipi);
	}
}
