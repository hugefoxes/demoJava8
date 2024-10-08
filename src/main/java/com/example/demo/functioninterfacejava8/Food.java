package com.example.demo.functioninterfacejava8;
@FunctionalInterface
public interface Food {
	public void method1();
}

@FunctionalInterface
interface Fruit extends Food{
	public void method1();
}
