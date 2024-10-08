package com.example.demo.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		
        List<Employee> emp2 = Arrays.asList(
                new Employee(1L,"John", "Abraham", "active", 20L, 20,"Developer"),
                new Employee(5L,"manya", "surve" , "active", 25L, 30, "Hr"),
                new Employee(6L,"Kiv", "marle", "active", 30L, 35, "Developer"),
                new Employee(8L,"Ninja", "K" , "active", 22L, 25, "Hr"),
                new Employee(7L,"mark", "m", "active", 18L, 23, "Developer")
                
        );
        
        //get sorted by salary
        List<Employee> emp3 = emp2.stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .collect(Collectors.toList());
        
        System.out.println("Sorted by salary asc :"+ emp3);
        
        //get sorted by salary reversed
        List<Employee> emp4 = emp2.stream()
        		.sorted(Comparator.comparing(Employee::getSalary).reversed())
        		.collect(Collectors.toList());
        
        System.out.println("sorted by salary desc :"+ emp4);
        
        //get max sal 
       Long maxSal =  emp2.stream().map(e -> e.getSalary()).max(Comparator.comparing(Long::longValue)).get();
       System.out.println("max sal:"+ maxSal);
        
        //get min sal
        Long minSal = emp2.stream().map(e -> e.getSalary()).min(Comparator.comparing(Long::longValue)).get();
        System.out.println("min sal:"+ minSal);
        
        //get max sal emp
        Employee mxSalEmployee = emp2.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("mxSalEmployee :"+ mxSalEmployee);
        
        //get min sal emp
        Employee minSalEmployee =  emp2.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("MinSalaEmployee: "+ minSalEmployee);
        
        //grouping by department
        
        Map<String, List<Employee>> map = emp2.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment));
        
        System.out.println("map :"+ map);
        //grouping by depar max get dept by max Sal 
        
        //grouping by depar  getdept by min sal
        
        //get total bydept
        Map<String, Long> map2 = emp2.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment, 
        				Collectors.summingLong(Employee::getSalary)))
//        		.entrySet()
//        		.stream()
        		;
        System.out.println("map2: "+ map2);
        
        //get the higheste sum of sal group by dept
        
        long min = emp2.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment, 
        				Collectors.summingLong(Employee::getSalary)))
        		.entrySet()
        		.stream()
        		.map(m -> m.getValue())
        		.min(Comparator.comparing(Long::longValue))
        		.get();
        
        System.out.println("min :"+min);
        
        long max = emp2.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment, 
        				Collectors.summingLong(Employee::getSalary)))
        		.entrySet()
        		.stream()
        		.map(m -> m.getValue())
        		.max(Comparator.comparing(Long::longValue))
        		.get();
        
        System.out.println("min :"+max);
        
        
//		int arr[] = {1,2,3,5,6,7, 8,9,10, 12};
//		int count = 0;
//
//		for(int i =0;  i < arr.length-1; i++){
//			//int k = arr[0];
//			count = arr[i]+1; //2,3,
//			
//			if(count != arr[i+1]){
//			System.out.println("missing number is:"+ count);
//			}
//		}
	}

}
