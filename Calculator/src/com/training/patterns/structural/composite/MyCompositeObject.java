package com.training.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MyCompositeObject {

	private String str;

	public MyCompositeObject(final String str) {
		this.str = str;
	}

	private List<MyCompositeObject> subObjects = new ArrayList<>();

	public void addSubObject(final MyCompositeObject myCompositeObject) {
		this.subObjects.add(myCompositeObject);
	}

	@Override
	public String toString() {
		return this.str;
	}

	public String toTreeString() {
		String string = this.str + "{";
		for (MyCompositeObject myCompositeObject : this.subObjects) {
			string += myCompositeObject.toTreeString() + ",";
		}

		return string + "}";
	}
}
