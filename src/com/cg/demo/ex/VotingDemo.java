package com.cg.demo.ex;

import java.util.Scanner;

public class VotingDemo {

	public static void checkEligibility(int age) {

		if (age < 18) {
			throw new IllegalVotingException("You can not vote.");

		} else {
			System.out.println("You can vote.");
		}
	}

	public static void main(String[] args) {

		System.out.println("Please enter your age- ");

		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		try {
			VotingDemo.checkEligibility(age);
		} catch (IllegalVotingException e) {
			System.out.println(e.getMessage());

		} finally {
			sc.close();
			System.out.println("End");
		}

	}
}
