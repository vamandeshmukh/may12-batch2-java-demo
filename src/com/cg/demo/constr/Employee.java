package com.cg.demo.constr;

public class Employee {

	int eid;
	String name;
	double salary;

	Employee() {
		System.out.println("no-args constructor");
	}

	Employee(int eid, String name, double salary) {
		System.out.println("constructor with arguments");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	void work() {
		System.out.println("Employee works...");
	}

	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}
