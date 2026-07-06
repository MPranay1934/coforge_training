package com.coforge.day5;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String args[]) {
		Vector <Integer> list = new Vector<>(); //Old Collection Framework Class
		
		list.add(new Integer(10)); //Boxing
		list.add(20); //AutoBoxing
		list.add(30);
		list.add(40);
		list.add(20);
		System.out.println(list);
		System.out.println(list.get(3)); //40
		
		list.remove(4);
		System.out.println(list);// 10 20 30 40
		
		list.set(3, 35);
		System.out.println(list);
		
		System.out.println(list.size());
		//Traverse using index
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Traverse without index
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Traverse using Iterator
		
		Iterator<Integer> it = list.iterator(); // traversing interface for any collection
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Traverse using Enumeration
		
		Enumeration<Integer> e = list.elements(); // old traversing interface only for vector 
	}
}
