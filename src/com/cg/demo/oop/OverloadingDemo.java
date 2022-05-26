package com.cg.demo.oop;
//- method overloading - 

//methods with the same name but with different arguments 
//- 1. number of arguments should be different 
//- 2. types of arguments should be different 
//- 3. order of arguments should be different 

public class OverloadingDemo {

	static void addNums(int i, int j) {
		System.out.println(i + j);
	}

	// - 1. number of arguments should be different
	static void addNums(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	// - 2. types of arguments should be different
	static void addNums(int i, long j) {
		System.out.println(i + j);
	}

	// - 3. order of arguments should be different
	static void addNums(long i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {
		OverloadingDemo.addNums(10, 20);
		OverloadingDemo.addNums(10, 20, 30);

	}

}
