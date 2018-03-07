package com.training.patterns.adapter;

public class API2 {
	public ICiz getDraw() {
		return new Ciz();
	}
}
