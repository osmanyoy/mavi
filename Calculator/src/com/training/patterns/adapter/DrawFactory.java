package com.training.patterns.adapter;

public class DrawFactory {
	public static IMyDraw getDrawLib(final int version) {
		if (version == 1) {

			return new DrawAdapter(new API().getDraw());
		} else {
			return new CizAdapter(new API2().getDraw());
		}
	}
}
