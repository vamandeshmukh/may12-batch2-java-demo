package com.cg.demo.loops;

public class BreakDemo {

	public static void main(String[] args) {

		int num = 1;

		while (num <= 10) {
			System.out.println(num);
			num++;

			if (num == 5) {
				break; // stop the loop and exit 
			}
		}
	}
}
