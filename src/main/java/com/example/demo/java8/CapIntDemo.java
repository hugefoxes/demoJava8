package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CapIntDemo {

	public static void main(String[] args) {
		int no = 1234321;
		String str =  String.valueOf(no);
		int lenght = str.length()/2;
		
		
		
		int a = -10;
		int b = 20;
		List<Integer> list =  new ArrayList<>();
		list.add(a);
		list.add(b);
		list=list.stream().sorted((x,y) -> y - x).collect(Collectors.toList());
		System.out.println("a :"+ list.get(0) +" b: "+ list.get(1));
	}

}
