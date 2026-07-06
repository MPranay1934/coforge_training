package com.coforge.day5;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
		
		set.add(new Integer(10)); //Boxing
		set.add(20); //AutoBoxing
		set.add(30);
		set.add(40);
		set.add(20);
		System.out.println(set);
		
		
		set.remove(40); //pass element instead of index
		System.out.println(set);// 10 20 30 40
		
		
		System.out.println(set);
		
		System.out.println(set.size());
	    
		//Traverse with index isnt possible
		
		//Traverse without index
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		//Traverse using Iterator
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
