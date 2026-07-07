package com.coforge.day6;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamApiTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);
		
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
        long count = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);
		
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);
		
		
		List<String> list1 = Arrays.asList("Teja","Pooja","Ojha");
		
		List<String> answer = list1.stream().filter(string -> string.contains("e")).collect(Collectors.toList());
		System.out.println(answer);
		
		list1.stream().filter(string -> string.contains("a")).map(str -> str.length());
		
		Date date = new Date(0);
		System.out.println(date);
		
		LocalDate dat = LocalDate.now();
		System.out.println(dat);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
	}

}
