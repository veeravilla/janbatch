package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;

@Controller
public class DemoController {
	
	@RequestMapping(method=RequestMethod.GET,value="/displayWelcome")
	public String showWelcome(){
		System.out.println(" ****** Spring Welcome  ******");
		//B.L
		return "welcome";  //View Name /WEB-INF/jsp/welcome.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/welcome") //View Name /WEB-INF/jsp/welcome.jsp
	public void getWelcome(){
		System.out.println(" ****** Spring Welcome  ******");
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/saveData") //View Name /WEB-INF/jsp/welcome.jsp
	public String readInput(HttpServletRequest request,HttpServletResponse response){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + request.getParameter("username"));
		return "welcome"; 
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/sendData/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public String userInputDemo(@PathVariable String username,String  password){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + username);
		System.out.println(" PAssword  : " + password);
		return "welcome"; 
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sendData") //View Name /WEB-INF/jsp/welcome.jsp
	public String userPostDemo(String username,String password){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + username);
		System.out.println(" PAssword  : " + password);
		return "welcome"; 
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getuserdata/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public ModelAndView returnOutputData(@PathVariable String username){
		//B.L
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		mv.addObject("username", username);
		mv.addObject("address", "567 N W , Gori St");
		mv.addObject("zipCode", "675756");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getuser/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public ModelAndView returnOutputObject(@PathVariable String username){
		//B.L
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userdemo");
		mv.addObject("userObj", new User(username, 76786, "567 N W , Gori St"));
		return mv;
	}
	
	
}
