package com.cg.demo.cls;

//OOP 

//Entity - anything which has real-world existence in that business - class 
//Features - attributes -> variables / fields 
//Behaviours - functionalities -> methods 

//static - common for all  -- access with class reference 
//non-static - unique to everyone  -- access with object reference 

//class - blueprint, template, blank form 
//object - instance of class, filled-in form  

public class Employee {

	static String officeAddress;
	int eid; // 101, 102, 103
	String name; // Sonu, Monu, Ponu
	double salary;

	void work() {
		System.out.println("Employee works...");
	}

	public static void main(String[] args) {

		officeAddress = "Gachibowli, Hyderabad";

		Employee obj = new Employee();

		obj.eid = 101;
		obj.name = "Sonu";
		obj.salary = 50000;

		System.out.println(obj.eid);
		System.out.println(obj.name);
		System.out.println(obj.salary);

	}

}
