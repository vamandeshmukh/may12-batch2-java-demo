package com.cg.demo.methods;

//DRY - don't repeat yourself.

public class MethodDemo {

	public static void main(String[] args) {

		System.out.println("main");
		hello();
		hello();
	}

	static void hello() {

		System.out.println("Hello buddies.\nWelcome to CG.");

	}

}
