package com.example.demo.lnt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

//	i/p : String word = "google";
//	o/p : {g=2, o=2, l=1, e=1}

	public static void main(String args[]) {
		String str = "google";
		// HashMap char as a key and occurrence as a value
		HashMap<Character, Integer> charCount = new HashMap<>();
		for (int i = str.length() - 1; i >= 0; i--) {
			
			if (charCount.containsKey(str.charAt(i))) {
				
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			} else {
				charCount.put(str.charAt(i), 1);
			}
			System.out.println(charCount.get(str.charAt(i)));
		}
		System.out.println(charCount);
		
		
		String str2= "google";  
		String [] arr= str2.split("");
		Arrays.asList(arr).forEach(s -> System.out.println(s));
		Arrays.stream(str2.split("")).map(m -> m.toLowerCase()).collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));
		Map<String, Long> result = Arrays.stream(str2.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(s -> s, HashMap::new, Collectors.counting()));  
		System.out.println("result :"+result); 
		
		
		StringProgram p = new StringProgram();	
		p.method1();		// o/p - Parent
		StaticOverrirdeEx c = new StaticOverrirdeEx();
		c.method1();		// o/p - child
		StringProgram p1 = new StaticOverrirdeEx();
		p1.method1();	// o/p - parent
		p1.method2();	// o/p - This is child m2 method
		
		char charVar = 'A';
	    Character Obj = charVar;
	    Obj++;
	    System.out.println(Obj);
	}

}
