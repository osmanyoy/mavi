package com.training.patterns.adapter;

public class DrawMain {
	public static void main(final String[] args) {
		DrawFactory.getDrawLib(2)
		           .drawline(10,
		                     20,
		                     10,
		                     20);
	}
}
