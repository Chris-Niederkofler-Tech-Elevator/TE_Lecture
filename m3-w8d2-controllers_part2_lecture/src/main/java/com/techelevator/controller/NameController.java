package com.techelevator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameController {
	
	@RequestMapping("/nameCollector")
	
	public String displayNameCollector() {
		
		return "nameController";
		
	}
	@RequestMapping("/nameCollectorResult")
	public String displayNameCollectorResult(HttpServletRequest request) {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
		
		return "nameCollectorResult";
	}

}
