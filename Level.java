package com.test.java8;

public enum Level {

	First(10), Second(20), Thrid(30), Fourth(40);

	private int price;

	Level(int i) {
		this.price = i;
		System.out.println("IN Enum Constructor");
	}

	public int getPrice(int z) {
		System.out.println("IN Enum Level");
		return price;
	}
}
