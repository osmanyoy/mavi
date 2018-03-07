package com.training.patterns.adapter;

public class Draw implements IDraw {

	@Override
	public void drawline(final int x1, final int y1, final int x2, final int y2) {
		System.out.println("Drawing : " + x1 + " " + x2);

	}

}
