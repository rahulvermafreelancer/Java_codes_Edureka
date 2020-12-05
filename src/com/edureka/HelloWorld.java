package com.edureka;

public class HelloWorld {
	
	final Integer instanceVariable = 10; // final value cannot change
	
	static Integer staticVariable = 15;
	
	public synchronized void nonStatictest() { // one thread at a time other one have to wait
		System.out.println("Non Static Method");
	}
	
	public static void statictest() {
		Integer localVariable = 20;
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		
		
		HelloWorld obj1 = new HelloWorld();
		HelloWorld obj2 = new HelloWorld();
		obj2.staticVariable = 50;
		
		System.out.println("Hello, World!");
		
		obj1.nonStatictest();
		
		statictest();
	}

}
