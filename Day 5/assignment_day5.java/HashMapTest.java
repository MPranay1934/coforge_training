package com.coforge.day5;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		//Inserting into map
		map.put(40,"Java");
		map.put(3, "Cpp");
		map.put(5, "Z");
		map.put(20, "React");
		System.out.println(map);
		map.put(4, "Jeep");
		System.out.println(map);
		
		//Removing from map
		map.remove(2,"React");
		System.out.println(map);
		
		System.out.println(map.get(3)); 
		
		//Traverse the Map Collection
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
			System.out.println(key + " => " + map.get(key));
		
		//Traverse the Map Collection
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry entry : entries) 
			System.out.println(entry.getKey() + " => " + entry.getValue());
    }
}
