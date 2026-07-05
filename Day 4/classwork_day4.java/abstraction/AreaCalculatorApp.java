package com.coforge.day4.abstraction;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		/*
		Rectangle rec = new Rectangle();
		rec.Area();
		
		Square sq = new Square();
		sq.Area();
		
		Triangle tri = new Triangle();
		tri.Area();
*/
		Areaplan figure;
		figure = new Rectangle();
		figure.Area();
		figure = new Square();
		figure.Area();
		figure = new Triangle();
		figure.Area();
		
	}

}
