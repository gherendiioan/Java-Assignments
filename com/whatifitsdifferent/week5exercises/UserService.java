package com.whatifitsdifferent.week5exercises;


public class UserService{
	
	public User createUser(String [] inputs) {
		
		User newUser = new User(null, null, null);
		
		newUser.setUsername(inputs[0]);
		newUser.setPassword(inputs[1]);
		newUser.setName(inputs[2]);
		
		return newUser;
		
	}
	
	public String[] parseText(String input) {
		
		String[] parseString = input.split(",");
		
		return parseString;
		}


	
	
}

