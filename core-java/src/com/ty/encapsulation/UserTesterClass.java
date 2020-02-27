package com.ty.encapsulation;

public class UserTesterClass {
	
//	private static User setUser(String username,String password,Integer userid) {
//		return new  User(username,password,userid);
//	}
	
	public static void main(String[] args) {
		User user1 = new User("Mike", "12345", 20200225);
	
		User user2 = new  User();
		
		user2.setUsername("Tody");
		user2.setUserid(124654);
		user2.setPassword("lokeshbyf873t");
		
		System.out.println("Username: "+user1.getUsername());
		System.out.println("UserId: "+user1.getUserid());
		
		System.out.println(user2);
	}
}
