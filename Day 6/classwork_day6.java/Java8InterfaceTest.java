package com.coforge.day6;

interface MyInterface {
	public void myMethod();
	default void myMethod2() {
		System.out.println("You can provide the definiton if it is mentioned as default");
		
	}
	static void myMethod3() {
		System.out.println("You can provide the definition if it is defined as static");
	}
}
public class Java8InterfaceTest implements MyInterface {

	public void myMethod() {
		System.out.println("abstract method");
	}
	public void myMethod2() {
		System.out.println("You can provide the definiton if it is mentioned as default");
		
	}
	public void myMethod3() {
		System.out.println("You can provide the definition if it is defined as static");
	}
	
	

}
