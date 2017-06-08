package com.xceltech.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.toplink.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xceltech.model.UserProfile;

@Controller
public class RegisterController {

	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping("/register")
	public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "register";
		
		
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerStudent(HttpServletRequest request){
		UserProfile userProfile = new UserProfile();
		userProfile.setName(request.getParameter("name"));
		userProfile.setEmail(request.getParameter("email"));
		userProfile.setGender(request.getParameter("gender"));
		userProfile.setAddress1(request.getParameter("address1"));
		userProfile.setAddress2(request.getParameter("address2"));
		userProfile.setCity(request.getParameter("city"));
		userProfile.setState(request.getParameter("state"));
		
		
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(userProfile);
		tx.commit();
		ModelAndView mv = new ModelAndView("confirmation");
		mv.addObject("profile", userProfile);
		
		return mv;
		
	}
	
}
