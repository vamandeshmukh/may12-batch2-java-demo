package com.cg.demo.pc1;

// access modifiers / access specifiers 

// public - accessible everywhere 
// protected - accessible within subclass and the package 
// <package> (default) - accessible within the package 
// private - accessible only within the class 

public class ModifierDemo {

	public static void main(String[] args) {
		System.out.println(Demo1.publicField);
		System.out.println(Demo1.protectedField);
		System.out.println(Demo1.packageField);
//		System.out.println(Demo1.privateField); // CE 
	}

}
