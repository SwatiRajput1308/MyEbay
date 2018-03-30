package com.aartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aartek.service.LoginService;

@Controller
public class LoginController 
{
	@Autowired
	private LoginService loginservice;
	
	@RequestMapping("/showPage")
	public String showPage()
	{
		return "showPage";
	}
}
