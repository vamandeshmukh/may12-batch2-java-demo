package com.cg.demo;

public class PaymentsDemo {
	
	// store five payments and find sum of them.  
	
	public static void main(String[] args) {
		
		double[] myPayments = new double[5];

		myPayments[0] = 50000;
		myPayments[1] = 75000;
		myPayments[2] = 35000;
		myPayments[3] = 20000;
		myPayments[4] = 83000;
		
		double totalPayment = 0;
		double remainingPayment = 0;
		
		System.out.println("payments to be made - ");

		for (double amount : myPayments) {
//			totalPayment += amount;
			totalPayment = totalPayment + amount;
			System.out.println(amount);
		}
		
		System.out.println("Total payment to be made - ");
		System.out.println(totalPayment);		
		
		myPayments[4] = 0;
		myPayments[0] = 0;
		
		System.out.println("remaining payments to be made - ");

		for (double amount : myPayments) {
//			totalPayment += amount;
			remainingPayment = remainingPayment + amount;
			System.out.println(amount);
		}
		
		System.out.println("Total remaining payment to be made - ");
		System.out.println(remainingPayment);		
	}

}
