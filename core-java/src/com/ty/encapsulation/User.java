package com.ty.encapsulation;

public class User {
	private String username;
	private String password;
	private Integer userid;
	
	public User(String username, String password, Integer userid) {
		super();
		this.username = username;
		this.password = password;
		this.userid = userid;
	}
	
	public User() {
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userid=" + userid + "]";
	}
}
