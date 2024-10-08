package com.example.demo.java8;

import java.util.*;

public class CapInt {

	public static void main(String[] args) throws Exception {
		CapInt c = new CapInt();
		c.method();
		
		//without java8 get closest number to 100
		List<Integer> list = Arrays.asList(1, 50,98,104,100,250);
		Integer closest = list.get(0);
		Integer target = 100;
		for(int number: list) {
			if(Math.abs(number - target)< Math.abs(closest - target)) {
				System.out.println("number: " +number);
				System.out.println("Math.abs(number - target): " +Math.abs(number - target));
				System.out.println("Math.abs(closest - target): " +Math.abs(closest - target));
				closest = number;
			}
		}
		System.out.println("closest number to 100: "+closest);
		
		//without java8 get maximum length of string
		
	}
	
	public void method() throws Exception{

        Integer a = 20, b = 10;

        Integer c = 200, d = 100;

        try{

           System.out.println("block 1");

            if(a>b)

                throw new Exception();
           System.out.println("block 2");

        }catch(Exception e){

        }

        try{

           System.out.println("block 3");

            if(c>d)

                throw new Exception();
          System.out.println("block 4");
        }catch(Exception e){
        }
    }

}



class HelloWorld {
    
    static int i;
    
    public static void main(String[] args) {
        
        HelloWorld.i = HelloWorld.i + 10;
        
        HelloWorld obj1 = new HelloWorld();
        obj1.i = obj1.i + 10;
        
        System.out.println(HelloWorld.i);
        System.out.println(obj1.i);
    }
}