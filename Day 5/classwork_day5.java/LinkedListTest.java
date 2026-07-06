package com.coforge.day5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String args[]) {
	List<Integer> list = new LinkedList<>();
	
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
	
	Iterator<Integer> it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
