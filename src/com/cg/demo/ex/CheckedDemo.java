package com.cg.demo.ex;

public class CheckedDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
