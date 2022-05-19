package com.cg.demo;

public class StringArrayDemo {

	public static void main(String[] args) {
		
		System.out.println("My friends");

		String[] myFriends = { "Sonu", "Monu", "Tonu" };
		System.out.println(myFriends.length);

		for (String friend : myFriends) {
			System.out.println(friend);
		}

		System.out.println("My other friends");
		
		String[] myOtherFriends = new String[3];

		myOtherFriends[0] = "Anil";
		myOtherFriends[1] = "Sunil";
		myOtherFriends[2] = "Vinil";

		for (String friend : myOtherFriends) {
			System.out.println(friend);
		}

		myOtherFriends[1] = "Abcd";
		System.out.println("Friend changed");

		for (String friend : myOtherFriends) {
			System.out.println(friend);
		}
		
		
		
		
		
		
		
	}
}