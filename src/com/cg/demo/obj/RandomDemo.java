package com.cg.demo.obj;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random ran = new Random();

		int num = 0;

		for (int i = 1; i <= 10; i++) {
 			num = ran.nextInt(100);
			System.out.println(num);
		}

	}

}
