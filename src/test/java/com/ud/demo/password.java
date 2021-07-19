package com.ud.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encode=new BCryptPasswordEncoder();
		String rawPassword="sh";
		String encodepassword=encode.encode(rawPassword);
		System.out.println(encodepassword);
		
	}

}
