package com.example.user;

/**
 * UserClient 构建逻辑都封装在 Starter 内部
 */
public class UserClient {

	private UserProperties userProperties;
	
	public UserClient() {
		
	}
	
	public UserClient(UserProperties p) {
		this.userProperties = p;
	}
	
	public String getName() {
		return userProperties.getName();
	}
	
}
