package com.training.patterns.bridge.real;

public class Run {
	public static void main(final String[] args) {
		Araba araba = new Araba(new SehirIci());
		System.out.println(araba.zamaniHesapla(100));

		Yuruyus yuruyus = new Yuruyus(new Asfalt());
		System.out.println(yuruyus.zamaniHesapla(100));

	}
}
