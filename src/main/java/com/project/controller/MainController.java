package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	

	@RequestMapping(value="/index")
	public String idex() {
		
		return "index";
	
 }
	@RequestMapping(value="/loginform")
	public String login() {
		return "loginform";
	}
	
}
