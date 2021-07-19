package com.ud.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authori_and_Authonitication_COntroller
{
	@RequestMapping("/new")
	public String usermsg()
	{
		return "user has permission to create ";
	}
	
	@RequestMapping("/delete")
	public String usermsg2()
	{
		return "admin has permission to create ";
	}
	@RequestMapping("/com")
	public String usermsg3()
	{
		return " Public pages ";
	}
}
