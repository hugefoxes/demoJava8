package com.example.demo.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProgramJava8 {

	public static void main(String[] args) {
		String input ="the cattle is rattled by battery in life";
		List<String> roots = Arrays.asList("cat","bat", "rat");
		
		Set<String> rootSet = new HashSet<>(roots);
		String[] words = input.split(" ");
		System.out.println(Arrays.asList(words));
		String result = Arrays.stream(words)
				.map(word -> {
					for(String root: rootSet) {
						if(word.startsWith(root)) {
							return root;
						}
					}
					return word;
				})
				.collect(Collectors.joining(" "));
		
		System.out.println("result: "+ result);
		
//		input -> aabbbcccdabbbaaac
//		output -> 2a3b3cda3b3ac
		
		String inputStr = "aabbbcccdabbbaaac";
		String outputStr = inputStr.chars().mapToObj(s -> (char)s)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.map(entry -> entry.getValue()+""+ entry.getKey())
		.collect(Collectors.joining());
		
		System.out.println(outputStr);
		
		//find 1st duplicate occurrence of string
//		5
		String inputStr2 = "siiikw";
		char [] carr = inputStr2.toCharArray();
		String op = inputStr2.chars().mapToObj(s -> (char)s)
		.collect(Collectors.groupingBy(Function.identity(), 
				LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue()>1)
		.map(m -> m.getKey())
		.findFirst().get().toString();
		
		System.out.println("output first duplicate :"+op);
		
		/// first duplicate string 
		String str = "i am vishal am i";
		
		String outputstr = Stream.of(str.split(" "))
//		.filter(s -> !s.equals(" "))
		.map(s -> { System.out.println(s); return s;})
		.collect(Collectors.groupingBy(Function.identity(), 
				LinkedHashMap::new, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue()>1)
		.map(m -> m.getKey())
		.findFirst().get().toString();
		
		System.out.println("outputstr :"+outputstr);
		
		
	}

}
