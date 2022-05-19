package com.cg.demo.obj;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Scanner Demo App.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String myName = sc.next();		
		System.out.println(myName);
		
		System.out.println("Please enter your salary:");
		double salary = sc.nextDouble();
		System.out.println(salary);
		
		System.out.println("Please enter phone:");
		long phone = sc.nextLong();
		System.out.println(phone);
		
		
		System.out.println("Thanks for using this app.");
				
		
	}

}
