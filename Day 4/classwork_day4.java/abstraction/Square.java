package com.coforge.day4.abstraction;

public class Square extends Figure {
	public Square() {
		super(10);
	}
	@Override
	public void Area() {
		double res1 = getSide() * getSide();
		System.out.println(" Area of the square : " + res1);
		
	}
	
   
}
