package com.cg.demo.oop;

// abstract method 
// abstract class
// interface 

// abstract method -
// it has the keyword abstract 
// does not have method body 
// it has only method signature 
// it can be created in abstract class, not in concrete class  

// abstract class 
// it has the keyword abstract 
// it contains 0 or more abstract methods 
// it also contains 0 or more concrete methods 
// its object can not be created 
// a concrete class should extend that abstract class - 
// and should override that abstract method 

// interface - 
// it allows multiple inheritance 
// it basically contains abstract methods 
// its object can not be created 
// a concrete class should implement that interface - 
// and should override that abstract method 

public class AbstractDemo {

	public static void main(String[] args) {
		
		String str = "abc";
		

		Hdfcbank bank1 = new Hdfcbank();
		bank1.payInterest();
		bank1.doKyc();

		AxisBank bank2 = new AxisBank();
		bank2.payInterest();
		bank2.doKyc();

//		Rbi bank3 = new Rbi(); // CE 

	}
}
