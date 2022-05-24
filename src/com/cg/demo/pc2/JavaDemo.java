package com.cg.demo.pc2;

public class JavaDemo {

	public static void main(String[] args) {

		System.out.println();
		Customer obj = new Customer(101, "Sonu");
		System.out.println(obj.toString());

		Customer obj2 = new Customer(101, "Sonu");
		System.out.println(obj2.toString());

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj.equals(obj2));

	}

}
