package com.cg.demo.oop;

public class EncapDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 50000);
		
//		emp.salary = 60000; // CE 

		System.out.println(emp.getSalary());

		emp.setSalary(60000);

		System.out.println(emp.getSalary());

	}

}
