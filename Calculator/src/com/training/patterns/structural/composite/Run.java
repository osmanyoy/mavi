package com.training.patterns.structural.composite;

public class Run {
	public static void main(final String[] args) {
		MyCompositeObject root = new MyCompositeObject("root");

		MyCompositeObject level1_1 = new MyCompositeObject("1_1");

		MyCompositeObject level1_2 = new MyCompositeObject("1_2");

		root.addSubObject(level1_1);
		root.addSubObject(level1_2);

		MyCompositeObject level2_1_1 = new MyCompositeObject("2_1_1");
		MyCompositeObject level2_1_2 = new MyCompositeObject("2_1_2");
		MyCompositeObject level2_1_3 = new MyCompositeObject("2_1_3");
		level1_1.addSubObject(level2_1_1);
		level1_1.addSubObject(level2_1_2);
		level1_1.addSubObject(level2_1_3);

		MyCompositeObject level2_2_1 = new MyCompositeObject("2_2_1");
		MyCompositeObject level2_2_2 = new MyCompositeObject("2_2_2");
		level1_2.addSubObject(level2_2_1);
		level1_2.addSubObject(level2_2_2);

		System.out.println(root.toTreeString());
	}
}
