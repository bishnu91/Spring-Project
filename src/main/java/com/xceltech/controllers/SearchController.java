package com.xceltech.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xceltech.model.UserProfile;

public class SearchController {

	
	@Controller
	public class WelcomeController {
		
		@Autowired
		private SessionFactory sessionFactory;
		

		@RequestMapping(value = "/search")
		public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
			return "search";
		}

		@RequestMapping(value = "/searchquery", method = RequestMethod.POST)
		public ModelAndView searchquery(HttpServletRequest request){
			UserProfile userProfile = new UserProfile();
			String name = request.getParameter("search");
		
			ModelAndView mv;
			System.out.println("SearchName :" + name );
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();
			
			session.find(name);
			tx.commit();
				mv = new ModelAndView("display");
				mv.addObject("profile", userProfile);
			return mv;
			
}
			
	
}
	}

