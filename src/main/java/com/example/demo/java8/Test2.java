package com.example.demo.java8;

import java.util.HashSet;

public class Test2 {

	public void m1(String str) {
		System.out.println("String method called");
	}
	public void m1(Object obj) {
		System.out.println("object method called");
	}
	
	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.m1(null);
		
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Integer> h2 = new HashSet<>();
		
		h1.add(1);
		h1.add(2);
		h1.add(13);
		h1.add(5);
		
		
		h2.add(1);
		h2.add(2);
		h2.add(3);
		h2.add(53);
		
		h1.forEach(h -> {
			if(h2.contains(h)) {
				System.out.println(h);
			}
		});
	}

}
