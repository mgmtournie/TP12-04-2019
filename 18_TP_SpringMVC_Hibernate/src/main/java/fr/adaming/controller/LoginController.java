package fr.adaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController    {
	
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	
	//commentaire 
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}
}