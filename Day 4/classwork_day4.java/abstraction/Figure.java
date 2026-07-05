package com.coforge.day4.abstraction;

public abstract class Figure implements Areaplan{
	private int length;
	private int breadth;
	private int side;
	private long base;
	private long height;
	
	public Figure(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Figure(int side) {
		super();
		this.side = side;
	}

	public Figure(long base, long height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public abstract void Area() ;

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getSide() {
		return side;
	}

	public long getBase() {		
		return base;
	}
		
	public long getHeight() {
		return height;
	}

}
