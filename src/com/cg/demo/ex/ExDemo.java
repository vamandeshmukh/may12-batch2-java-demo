package com.cg.demo.ex;

import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1 = sc.nextInt(); // 0
		System.out.println("Enter num2:");
		int num2 = sc.nextInt();

		try {
			System.out.println(num1 / num2);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Don't divide by 0.");
		}
		
		System.out.println("End");

//		try {
//			// code that may cause exception 
//		}
//		catch () {
//			// recovery code 
//		}

	}

}
