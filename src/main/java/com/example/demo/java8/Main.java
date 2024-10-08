package com.example.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	 public static void main(String[] args) {
	        // Sample list of employees
	        List<Employee> employees = Arrays.asList(
	                new Employee("John", Arrays.asList(123456789L), 19000L),
	                new Employee("Alice", Arrays.asList(111222333L, 444555666L), 15000L),
	                new Employee("Bob", Arrays.asList(777888999L, 555444333L), 21000L)
	        );

	        // Using streams to collect all phone numbers
//	        List<Long> allPhoneNumbers = employees.stream()
//	                .flatMap(employee -> employee.getPhoneNumbers().stream())
//	                .map(m -> {
//	                	System.out.println("op: "+m);
//	                	return m;
//	                })
//	                .collect(Collectors.toList());
//
//	        System.out.println("All phone numbers: " + allPhoneNumbers);
//	        
//	        List<String> names = employees.stream()
//	                .map(employee -> employee.getName())
//	                .collect(Collectors.toList());
//
//	        System.out.println("All names: " + names);
	        
	        List<Employee> ls = employees.stream().sorted(Comparator.comparing(Employee :: getSalary)).collect(Collectors.toList());
	        System.out.println("sorted by salary : " + ls);
	        
	        List<Employee> emp = Arrays.asList(
	                new Employee("John", "Abraham"),
	                new Employee("Alice", "Mali"),
	                new Employee("Bob", "Kale")
	        );
	        
	        List<String> strList = emp.stream().map(m -> m.getName() +" "+m.getLastName()).collect(Collectors.toList());
	        System.out.println("full name list : " + strList);
	        
	        Long maxsal = employees.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).limit(1).findFirst().get();
	 
	        List<Employee> emp1 = Arrays.asList(
	                new Employee(1L,"John", "Abraham", "active", 5L, 30),
	                new Employee(2L,"Alice", "Mali" , "active", 10L, 20),
	                new Employee(3L,"Bob", "Kale", "active", 10L, 23)
	        );
	        
	        List<Employee> emp2 = Arrays.asList(
	                new Employee(1L,"John", "Abraham", "active", 20L, 20),
	                new Employee(5L,"manya", "surve" , "active", 25L, 30),
	                new Employee(6L,"Kiv", "marle", "active", 30L, 35)
	        );
	        List<String> namesFromList2 = emp2.stream().map(m -> m.getName()).collect(Collectors.toList());
	        
	        List<Employee> emp3 = Stream.concat(emp1.stream()
	        		.map(m -> {
	        			if(namesFromList2.contains(m.getName())) {
	        				 m.setIsActive("Inactive");
	        				 return m;
	        			}
	        			return m;
	        		})
	        		, emp2.stream()).toList();
	        System.out.println();
	        emp3.forEach(e -> System.out.println("e : "+ e));
	        System.out.println();
	        Map<Long, Employee> eMap = emp2.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
	        eMap.entrySet().forEach(e -> System.out.println(e.getKey() +" :-"+ e.getValue().toString()));
	        System.out.println();
	        System.out.println("--------increaed salary by 20% and sorted reverse and filterd age > 21------------------");
	        emp2.stream()
	        .filter(e ->  e.getAge()> 21)
	        .map(e -> {
	        	e.setSalary(e.getSalary() + e.getSalary()*20/100);
	        	return e;
	        })
	        .sorted(Comparator.comparing(Employee::getSalary).reversed())
	        .forEach(e -> System.out.println(e))
	        ;
	 }
}
