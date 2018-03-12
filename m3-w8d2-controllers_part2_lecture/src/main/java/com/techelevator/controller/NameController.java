package com.techelevator.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameController {
	
	@RequestMapping("/nameCollector")
	
	public String displayNameCollector() {
		
		return "nameController";
		
	}
	@RequestMapping("/nameCollectorResult")
=======
=======
import org.springframework.ui.Model;
>>>>>>> c45761f0f50711a56af726afefe5555857834d88
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.PersonName;

@Controller
public class NameController {

	@RequestMapping("/nameCollector")
	public String displayNameCollector() {
		
		return "nameCollector";
	}
	
	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.GET)
<<<<<<< HEAD
>>>>>>> 14999da40c9224cd7e7d99f130591799a0050433
	public String displayNameCollectorResult(HttpServletRequest request) {
=======
	public String displayNameCollectorResult(HttpServletRequest request, Model model) {
>>>>>>> c45761f0f50711a56af726afefe5555857834d88
		
//		if (model.containsAttribute("personName")) {
//			PersonName personName = (PersonName) model.asMap().get("personName");
//		}
		
<<<<<<< HEAD
		request.setAttribute("firstName", firstName);
		request.setAttribute("lastName", lastName);
<<<<<<< HEAD
		
		return "nameCollectorResult";
	}

=======
=======
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
//		
//		request.setAttribute("firstName", firstName);
//		request.setAttribute("lastName", lastName);
>>>>>>> c45761f0f50711a56af726afefe5555857834d88
		request.setAttribute("method", "GET");
//		return "nameCollectorResult";
		return "nameCollector";
		
	}
	
	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.POST)
	public String displayNameCollectorResultPost( 
			PersonName personName, ModelMap model, HttpServletRequest request,
			RedirectAttributes redirectAttr) {
//		request.setAttribute("firstName", personName.getFirstName());
//		request.setAttribute("lastName", personName.getLastName());
//		model.addAttribute("personName", personName);
		redirectAttr.addFlashAttribute("personName", personName);
		
		model.addAttribute("method", "POST");
		return "redirect:/nameCollectorResult";
		
	}
	
	
//	@RequestMapping(path="/nameCollectorResult", method=RequestMethod.POST)
////	public String displayNameCollectorResultPost(HttpServletRequest request, 
////			@RequestParam(required=false, name="fName") String firstName, @RequestParam String lastName) {
//	public String displayNameCollectorResultPost( 
//			PersonName personName, ModelMap model) {
////		String firstName = request.getParameter("firstName");
////		String lastName = request.getParameter("lastName");
//		
////		request.setAttribute("firstName", personName.getFirstName());
////		request.setAttribute("lastName", personName.getLastName());
//		
//		model.addAttribute("personName", personName);
//		model.addAttribute("method", "POST");
//		//request.setAttribute("method", "POST");
//		return "nameCollectorResult";
//		
//	}
	
//	@RequestMapping(path="/nameCollectorResultFinal", method=RequestMethod.POST)
//	public String displayNameCollectorResultPostFinal( 
//			PersonName personName, ModelMap model) {
//
//		model.addAttribute("personName", personName);
//		model.addAttribute("method", "POST");
//		return "nameCollectorResult";
//		
//	}
	
>>>>>>> 14999da40c9224cd7e7d99f130591799a0050433
}
