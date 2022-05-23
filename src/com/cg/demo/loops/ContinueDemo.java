package com.cg.demo.loops;

public class ContinueDemo {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 10) {

			System.out.println(num);
			num++;

			if (num == 5) {
				continue; // skips one iteration
			}
		}
	}
}
