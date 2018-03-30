package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.repository.LoginRepository;

@Service
public class LoginService 
{
	@Autowired
	private LoginRepository loginrepository;
	
	public void showPage()
	{
		loginrepository.showPage();
		
		System.out.println("inside service");
	}
	
}
