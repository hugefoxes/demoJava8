package com.example.demo.functioninterfacejava8;

public class FoodImpl{

	public static void main(String[] args) {
		Food f = () -> System.out.println("done..");
		f.method1();
		
//		Fruit f2 = () -> System.out.println("done..");
//		f2.method1();
		A a = new A();
		a.method1();
		
		A a2 = new B();
		a2.method1();
		
	}

}

class A{
	public void method1() {
		System.out.println("m1..");
	}
}

class B extends A{
//	public void method1() {
//		System.out.println("B : -m1..");
//	}
	public void method2() {
		System.out.println("B : - m2..");
	}
}
