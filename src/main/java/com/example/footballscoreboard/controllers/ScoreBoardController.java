package com.example.footballscoreboard.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ScoreBoardController {

	/**
	 * This method maps the URL '/' to the view 'scoreBoardMain'.
	 * 
	 * @return The logical name of the view to be returned.
	 */
	@RequestMapping(value = "/")
	public String index(Model model) {
	    return "scoreBoardMain";
	}
	
	
	
}