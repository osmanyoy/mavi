package com.training.patterns.adapter;

public class Ciz implements ICiz {

	@Override
	public void drawline(final int x1, final int y1, final int deltaX, final int deltaY) {
		System.out.println("Ciziyorum : " + x1 + " " + y1);
	}

}
