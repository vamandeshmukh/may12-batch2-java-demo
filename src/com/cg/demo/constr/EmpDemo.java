package com.cg.demo.constr;

public class EmpDemo {

	public static void main(String[] args) {

		int num = 10;
// 		ClassName objectName = new ConstructorName();
		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Sonu";
		emp.salary = 50000;
		System.out.println(emp.toString());

	}

}
