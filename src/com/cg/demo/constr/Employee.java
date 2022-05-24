package com.cg.demo.constr;

public class Employee {

	int eid;
	String name;
	double salary;

	void work() {
		System.out.println("Employee works...");
	}

	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}
