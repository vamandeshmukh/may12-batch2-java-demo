package com.cg.demo.cls;

public class EmpDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 102;
		emp.name = "Monu";
		emp.salary = 55000;

		System.out.println(emp.eid);
		System.out.println(emp.name);
		System.out.println(emp.salary);

		emp.work();

	}

}
