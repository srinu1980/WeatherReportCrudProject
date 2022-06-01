package com.hcl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

	
	@RequestMapping("/about")
	public String showAbout()
	{
		
		return "This is about page";
	}
}
