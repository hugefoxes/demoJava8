package com.example.demo.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CapGTest {

	public static void main(String[] args) {
		CapGTest c= new CapGTest();
		c.test();
		
		String s= "Sachin";
		s.concat("Tendulkar");
		System.out.println(s);
		
		Map<Integer, Integer> m = new HashMap<>();
		m.put(1, 3);
		m.put(4, 2);
		m.put(5, 5);
		m.put(6, 1);
		m.put(9, 7);
//		m.entrySet().stream().collect(Collectors.toList());
		m.entrySet().stream().forEach(a -> System.out.println(a.getKey()));
		
		//find neares value to 100
//		Map<Integer, Integer> m2 = new HashMap<>();
		
//		Stream.of(1, 50,98,101,250).forEach(a -> {
//			int k = 100 -a;
//			m2.put(a, k);
//		});
//		m2.entrySet().stream().sorted(Map.Entry.comparingByValue()).filter(i -> i.getValue() >= 100 && i.getValue()<= 100).forEach(a -> System.out.println(a.getKey()+" "+a.getValue()));
		
		// Finding the nearest value to 100
        Integer nearestValue = Stream.of(1, 50,98,101,250,99)
            .reduce((a, b) -> Math.abs(a - 100) < Math.abs(b - 100) ? a : b)
            .orElse(null); // Handle the case where the list is empty
        
        System.out.println("nearestValue :"+nearestValue);
	}

	public void test() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		method(list);

		System.out.println(list.size()); // 4
	}

	public void method(List li) {
		li.add(3);
		li.add(4);
		System.out.println(li.size());
	}

}
