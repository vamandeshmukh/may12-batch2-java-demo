package com.cg.demo;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		int sum = num1 + num2;
		
		System.out.println("sum"); //  

		System.out.println(sum); // 300     
		
		System.out.println(sum++); // 301, 300 
		
		System.out.println(++sum); // 302, 302  
		
		System.out.println(sum--); // 299, 301, 302 
		
		System.out.println(sum); // 301 
		
	}

}
