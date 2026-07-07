package com.coforge.day6;

import java.lang.ref.Reference;

@FunctionalInterface
interface myInterface1 {
	void showMessage();
}
public class MethodInstanceTest {
	void Instance() {
		System.out.println("Instance is created");
	}
	
	static void Instance1() {
		System.out.println("Instance 1 is created");
	}
	MethodInstanceTest() {
		System.out.println("Constructor");
	}
	
	public static void main(String args[]) {
		MethodInstanceTest obj = new MethodInstanceTest();
		myInterface1 reference = obj::Instance;
		reference.showMessage();
		
	}


}
