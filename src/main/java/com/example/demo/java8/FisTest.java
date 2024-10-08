package com.example.demo.java8;

import java.util.TreeSet;

public class FisTest {

	public static void main(String[] args) {

		String input = "mbcadcafkkjj";
//		String output = "aabccdfjjkkm";
		
		char arr[] = input.toCharArray();
		String output = "";
		
		for(int i =0; i< arr.length-1; i++)
		{
			
			if(arr[i] > arr[i+1]) {
				output = output + arr[i];
			}
			else {
				output = output + arr[i+1];
			}
			
		}		
		
		System.out.println(output);
	}

}
