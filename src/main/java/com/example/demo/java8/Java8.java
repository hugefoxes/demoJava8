package com.example.demo.java8;

import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
import java.util.Map.Entry;
//import java.util.Optional;
//import java.util.Set;
import java.util.function.Function;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) 
    {
        String inputString = "VViiishhall kooolhhhe";
        String noSpaceStr = inputString.replaceAll("\\s", "");
        Map<Character, Long> charCountMap = 
        		noSpaceStr.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        System.out.println(charCountMap);
        
        Integer maximum = Stream.of(10,13,4,9,2,100).max(Comparator.comparing(Integer::valueOf)).get();
        
        System.out.println("maximum : "+maximum);
        
        Integer minimum = Stream.of(10,13,4,9,2,100).min(Comparator.comparing(Integer::valueOf)).get();
        
        System.out.println("minimum : "+minimum);
        

        List<Integer> integerList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
        int max = integerList.stream().max(Comparator.naturalOrder()).get();
         
        System.out.println("Maximum Element : "+max);
         
        int min = integerList.stream().min(Comparator.naturalOrder()).get();
         
        System.out.println("Minimum Element : "+min);
        
        

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
         
        Map<String, Long> stationeryCountMap = 
                stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
//        System.out.println(stationeryCountMap);
        
        List<String> strings = Arrays.asList("vik","vir", "kkk","kkk","llki","llki","vik","vv","vv","vv");
        
        Map<String, Long> map = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println(map);
        
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted().forEach(System.out::println);
        System.out.println("----------------reverse-----------------------------");
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println("listOfStrings :" +listOfStrings);
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
         
        System.out.println(joinedString);
        
     // Compute sum of salaries by department
//        Map<Department, Integer> totalByDept = employees.stream()
//          .collect(Collectors.groupingBy(Employee::getDepartment,
//                                         Collectors.summingInt(Employee::getSalary)));
       
        
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        
        Map<Boolean, List<Integer>> oddEvenNumbersMap = 
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
         
        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
         int count =0;
        for (Entry<Boolean, List<Integer>> entry : entrySet) 
        {
        	count ++;
            System.out.println("--------------count :"+ count);
             
            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }
             
            System.out.println("--------------");
             
            List<Integer> list = entry.getValue();
             
            for (int i : list)
            {
                System.out.println(i);
            }
        }
      
        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 3, 9, 5};
         
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
         
        System.out.println(Arrays.toString(c));
        
       //10) How do you merge two unsorted arrays into single sorted array without duplicates? 
        int[] x = new int[] {4, 2, 5, 1};
        
        int[] y = new int[] {8, 1, 9, 5};
        
        int[] z = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
         
        System.out.println(Arrays.toString(c));
        
        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        //3 minimum Numbers
         
        System.out.println("-----------------");
         
        System.out.println("Minimum 3 Numbers");
         
        System.out.println("-----------------");
         
        listIntegers.stream().sorted().limit(3).forEach(System.out::println);
         
        //3 Maximum Numbers
         
        System.out.println("-----------------");
         
        System.out.println("Maximum 3 Numbers");
         
        System.out.println("-----------------");
         
        listIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        
//        12) Java 8 program to check if two strings are anagrams or not?
        String s1 = "RaceCar";
        String s2 = "CarRace";
         
        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("s1: "+s1);
        System.out.println("s2: "+s2);
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
        
        //13) Find sum of all digits of a number in Java 8?
        int i = 15623;
        
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
         
        System.out.println(sumOfDigits);
        
        //14) Find second largest number in an integer array?
        List<Integer> integers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        Integer secondLargestNumber = integers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         
        System.out.println("secondLargestNumber :"+secondLargestNumber);

        Integer secondSmallestNumber = integers.stream().sorted().skip(1).findFirst().get();
        
        System.out.println("secondSmallestNumber :"+secondSmallestNumber);

//        15) Given a list of strings, sort them according to increasing order of their length?

        List<String> Strings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        Strings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
     
//        16) Given an integer array, find sum and average of all elements?
        int[] num = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        
        int sum = Arrays.stream(num).sum();
         
        System.out.println("Sum = "+sum);
         
        double average = Arrays.stream(num).average().getAsDouble();
         
        System.out.println("Average = "+average);
        
//        17) How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
         
        list1.stream().filter(list2::contains).forEach(System.out::println);
        
//        18) Reverse each word of a string using Java 8 streams?
        
        String str = "Java Concept Of The Day";
        Stream.of(str)
        .map(word->new StringBuilder(word).reverse()).forEach(System.out::println);
        String reversedStr = Arrays.stream(str.split(" "))
                                    .map(word -> new StringBuffer(word).reverse())
                                    .collect(Collectors.joining(" "));
         
        System.out.println("reversed string :"+reversedStr);
        
        String originalString = "Java Concept Of The Day";  
        IntStream charStream = originalString.chars();  
        Stream<String> charStringStream = charStream.mapToObj(ch -> String.valueOf((char) ch));  
        String reversedString = charStringStream.reduce((acc, ch) -> ch + acc).orElse("");  
        System.out.println("reversedString"+reversedString); // Output: !dlroW ,olleH  
        
//        19) How do you find sum of first 10 natural numbers?
        int sum1 = IntStream.rangeClosed(1, 10).sum();
        
        System.out.println("sum1 :"+sum1);
        int sum2 = IntStream.range(1, 11).sum();
        System.out.println("sum2 :"+sum2);
//        20) Reverse an integer array

        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(l -> array[array.length - l]).toArray();
         
        System.out.println(Arrays.toString(reversedArray));
        
//        21) Print first 10 even numbers

        IntStream.rangeClosed(1, 10).map(l -> l * 2).forEach(System.out::println);
        
//        22) How do you find the most repeated element in an array?
        List<String> listStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        
        Map<String, Long> elementCountMap = listStrings.stream()
                                                         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         
        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
         
        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
         
        System.out.println("Count : "+mostFrequentElement.getValue());
        
//23) Palindrome program using Java 8 streams
//        String ipStr = "ROTATOR";
//        
//        boolean isItPalindrome = IntStream.range(0, ipStr.length()/2).
//                noneMatch(l -> ipStr.charAt(l) != ipStr.charAt(str.length()-1));
//          
//        if (isItPalindrome)
//        {
//            System.out.println(ipStr+" is a palindrome");
//        }
//        else
//        {
//            System.out.println(ipStr+" is not a palindrome");
//        }

//        24) Given a list of strings, find out those strings which start with a number?
        List<String> listOfStr = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        
        listOfStr.stream().filter(str1 -> Character.isDigit(str1.charAt(0))).forEach(System.out::println);

//        25) How do you extract duplicate elements from an array?
        List<Integer> listOfInt= Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        
        Set<Integer> uniqueElements = new HashSet<>();
         
        Set<Integer> duplicateElements = listOfInt.stream().filter(l -> ! uniqueElements.add(l)).collect(Collectors.toSet());
        //2nd way to find duplicates
//        List<Integer> duplicateEle = listOfInt.stream().filter(l -> ! uniqueElements.add(l)).collect(Collectors.toList());
//        System.out.println("duplicateEle :"+duplicateEle);
        System.out.println("duplicateElements :"+duplicateElements);
        
// https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/         
        
        String name = "vishal is name My";
       String output =  Arrays.stream(name.split(" "))
        .reduce((v,m) -> m+" "+v)
        .orElse(" ");
//        .forEach(s -> System.out.println(s));
//        .collect(Collectors.joining(" "));
       System.out.println(output);
        
        
   List<Integer> intlist= Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);
    //double integer *2
    //sum of all integer

    Integer sumint = intlist.stream().map(m -> m*2).reduce((k,l) -> k+l).get();
System.out.println("sumint: "+ sumint);
    	int secondlarge= intlist.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    	System.out.println("secondlarge: "+ secondlarge);
    	
    	String strChar = "i am Vikrant";
    	
    	Character result = strChar.chars()
    	.mapToObj(m -> (char) m)
    	.filter(s -> !s.equals(' '))
    	.collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new))
    	.entrySet().stream().filter(entry -> entry.getValue() > 1)
    	.map(Map.Entry::getKey)
    	.findFirst().orElse(null);
    	
    	System.out.println("result "+ result);
        
    	Character result2 = strChar.chars()
    	    	.mapToObj(m -> (char) m)
    	    	.filter(s -> !s.equals(' '))
    	    	.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
    	    	.entrySet().stream().filter(entry -> entry.getValue() > 1)
    	    	.map(Map.Entry::getKey)
    	    	.findFirst().orElse(null);
    	    	
    	    	System.out.println("result2 "+ result2);
    	
        
        
        
        
        
        
        
        

    }
}
