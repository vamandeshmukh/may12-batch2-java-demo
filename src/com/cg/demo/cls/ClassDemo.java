package com.cg.demo.cls;

// OOP 

// Entity - anything which has real-world existence in that business - class 
// Features - attributes -> variables / fields 
// Behaviours - functionalities -> methods 

// static - common for all  -- access with class reference 
// non-static - unique to everyone  -- access with object reference 

// class - blueprint, template, blank form 
// object - instance of class, filled-in form  

public class ClassDemo {

	public static void main(String[] args) {
		System.out.println("main");
		someMethod();
		someOtherMethod();
	}

	static void someMethod() {
		System.out.println("some method");
	}

	static void someOtherMethod() {
		System.out.println("some other method");
	}
}
