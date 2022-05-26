package com.cg.demo.oop;

public class InheritanceDemo {

	public static void main(String[] args) {

		System.out.println("basic phone");
		BasicPhone phone1 = new BasicPhone();
		phone1.call();
		phone1.sms();

		System.out.println("smart phone");
		SmartPhone phone2 = new SmartPhone();
		phone2.camera();
		phone2.music();
		phone2.call();
		phone2.sms();

	}

}
