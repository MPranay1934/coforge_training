package com.coforge.day5;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		//Adding elements
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		
		//Removing elements
		
		stack.pop();
		System.out.println(stack);
		
		//Printing top element
		System.out.println(stack.peek());
		
		System.out.println(stack);
	}

}
