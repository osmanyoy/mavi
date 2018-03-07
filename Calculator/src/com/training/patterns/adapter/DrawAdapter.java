package com.training.patterns.adapter;

public class DrawAdapter implements IMyDraw {

	private IDraw draw;

	public DrawAdapter(final IDraw draw) {
		this.draw = draw;
	}

	@Override
	public void drawline(final int x1, final int y1, final int x2, final int y2) {
		this.draw.drawline(x1,
		                   y1,
		                   x2,
		                   y2);
	}

}
