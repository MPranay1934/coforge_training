package com.coforge.day6;

@FunctionalInterface
interface Calculator {
	public int calc(int a, int b);
}
public class LambdaTest { //LambdaExp is anonymous

	public static void main(String[] args) {
		Calculator calculator = (a,b) -> a + b;
		System.out.println(calculator.calc(10, 30));
		
		calculator = (a,b) -> a - b;
		System.out.println(calculator.calc(100, 30));
		

	}
	
	

}
