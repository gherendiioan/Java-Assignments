package com.whatifitsdifferent.week5exercises;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] dummyUser = new String[3];
		
		dummyUser[0] = "TheUserName";
		dummyUser[1] = "ThePassword";
		dummyUser[2] = "TheName";
		
		
		UserService firstUserService = new UserService();
		
		User justARandomUser = firstUserService.createUser(dummyUser);
		
		String[] testUser0 = firstUserService.parseText(dummyUser[0]);
		
		System.out.println("Here's your user: ");
		System.out.println(justARandomUser.getPassword());
		System.out.println(testUser0[2]);
		
	}

}
