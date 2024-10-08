package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(21);
		list.add(2);
		list.add(21);
		list.add(2);
		list.add(23);
		list.add(66);
		
		HashSet h = new HashSet<>();
		
		List<Integer> listOfDuplicates= new ArrayList<>();
		
		list.forEach(m -> {
			if(!h.add(m) && !listOfDuplicates.contains(m)) {
				
				listOfDuplicates.add(m);
			}
		});
		
		System.out.println("listOfDuplicates :-"+ listOfDuplicates);
	}

}
