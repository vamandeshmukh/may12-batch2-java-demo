package com.cg.demo.methods;

public class MethodDemo2 {

	public static void main(String[] args) {

		System.out.println("main");

		System.out.println(piValue());

	}

	static double piValue() {
		System.out.println(hi());
		return 3.14;
	}

	static String hi() {
		return "Hi buddies";
	}

}
