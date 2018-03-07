package com.training.patterns.adapter;

public class CizAdapter implements IMyDraw {
	private ICiz ciz;

	public CizAdapter(final ICiz ciz) {
		this.ciz = ciz;
	}

	@Override
	public void drawline(final int x1, final int y1, final int x2, final int y2) {
		this.ciz.drawline(x1,
		                  y1,
		                  x2 - x1,
		                  y2 - y1);
	}

}
