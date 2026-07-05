package com.coforge.day4.exception;

public class ExceptionClass {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		int a = 10/0; //java.lang.ArithmeticException
		
		int b = Integer.parseInt("abc"); //java.lang.NumberFormatException
		
		int arr[] = {1,2,3};
		System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundException
		
		int ar[] = new int[-5];//java.lang.NegativeArraySizeException
		
		String s = null;
		System.out.println(s.length());//java.lang.NullPointerException
		
		System.out.println("After Exception");

	}

}
