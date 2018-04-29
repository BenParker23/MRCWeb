package com.mrc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mrc.model.MUser;

@RestController
public class MainController {

	
	
	/** 
	 * The method which maps to the home page
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView home(@RequestParam(name="name", required=false, defaultValue="World") String name, HttpServletRequest req, HttpServletResponse resp) {
		 ModelAndView mav = new ModelAndView("index");
		 MUser user = new MUser();
		 user.setUsername("BenParker");
		 mav.addObject("login", user);
		 return mav;
	}
	
	
	/** 
	 * The method which maps to the home page
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "Login";
	}
	

	 
	 
}
