package com.coforge.day4;

public class Triangle extends Figure {
	public Triangle() {
		super(10L,20L);
	}
	@Override
	public void Area() {
		double res2 = 0.5 * getBase() * getHeight();
		System.out.println(" Area of the triangle is : " + res2);
		
	}

}
