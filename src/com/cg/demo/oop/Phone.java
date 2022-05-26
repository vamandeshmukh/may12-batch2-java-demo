package com.cg.demo.oop;

// DRY - 

class BasicPhone {

	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}
}

class SmartPhone extends BasicPhone {

	void music() {
		System.out.println("Playing music...");
	}

	void camera() {
		System.out.println("Clicking pics...");

	}

}

public class Phone {

}
