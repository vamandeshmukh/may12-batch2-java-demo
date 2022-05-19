package com.cg.demo;

import java.util.Scanner;

public class RailBerths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome \n Please enter berth number:");

		int berthNumber = sc.nextInt(); // 1 - 72
		String berthType = "";

		if (berthNumber < 1 || berthNumber > 72) {
			System.out.println("Wrong input!");
		} else if (berthNumber % 8 == 1 || berthNumber % 8 == 4) {
			berthType = "lower";
		} else if (berthNumber % 8 == 2 || berthNumber % 8 == 5) {
			berthType = "middle";
		} else if (berthNumber % 8 == 3 || berthNumber % 8 == 6) {
			berthType = "upper";
		} else if (berthNumber % 8 == 7) {
			berthType = "side-lower"; 
		} else {
			berthType = "side-upper";
		}

		System.out.println(berthNumber);
		System.out.println(berthType);

	}

}

//72 
//1 to 72 
//
//lower		1 4 9  12
//middle 		2 5 10 13
//upper 		3 6 11 14
//side lower 	  7    15
//side upper 	  8    16   ...    72
//
//
//input - berth number 
//output - berth type 
