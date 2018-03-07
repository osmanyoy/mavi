package com.training.patterns.adapter;

public class API {
	public IDraw getDraw() {
		return new Draw();
	}
}
