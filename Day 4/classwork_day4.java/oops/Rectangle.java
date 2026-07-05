package com.coforge.day4;

public class Rectangle extends Figure {
	public Rectangle() {
	  super(10,20);
	}
	@Override
	public void Area() {
		double res = getLength() * getBreadth();
		System.out.println(" Area of the rectangle : " + res);
		
	}
	
}
