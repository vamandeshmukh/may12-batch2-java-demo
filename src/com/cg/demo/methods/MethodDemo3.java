package com.cg.demo.methods;

public class MethodDemo3 {

	public static void main(String[] args) {

		System.out.println("main");

		int output = addNums(10, 20); // 30
		System.out.println(output);

		int a = 15, b = 25;
		int output2 = addNums(a, b); // 40
		System.out.println(output2);

		System.out.println(addNums(11, 22));

		hi("Sonu");

	}

	static int addNums(int i, int j) {
		return i + j;
	}

	static void hi(String name) {
		System.out.println("Hi " + name);
	}

}
