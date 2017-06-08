 package com.xceltech.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "login";
	}

	@RequestMapping(value = "/checklogin", method = RequestMethod.POST)
	public ModelAndView checklogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("userpasswd");

		ModelAndView mv;
		System.out.println("Name :" + name + "password : " + password);
		
		if (name.equals("Bishnu") && password.equals("1234")) {
			mv = new ModelAndView("home");
			mv.addObject("username", name);
		} else {
			mv = new ModelAndView("login");
			mv.addObject("msg", "please Try Again");
		}
		// System.out.println("Name : " + name + " Password : " + password);

		return mv;
	}
	// }

	// @RequestMapping(value="/checklogin", method=RequestMethod.POST)
	// public String checklogin1(@RequestParam("username") String name,
	// @RequestParam("userpasswd") String password) throws IOException{
	// String name = request.getParameter("username");
	// String password = request.getParameter("userpasswd");
	// System.out.println("Name : " + name + " Password : " + password);

	// return "home";
	// }

	}


