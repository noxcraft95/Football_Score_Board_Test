package com.example.footballscoreboard.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.footballscoreboard.matches.Match;
import com.example.footballscoreboard.matches.MatchesManager;

import countries.CountriesUtils;


@Controller
public class ScoreBoardController {
	
	private MatchesManager matchesManager = new MatchesManager();

	
	/**
	 * This method maps the URL '/' to the view 'scoreBoardMain'.
	 * 
	 * @return The logical name of the view to be returned.
	 */
	
	
	@RequestMapping(value = "/")
	public String index(Model model) {
		
		//Load countries
		model.addAttribute("countries",CountriesUtils.getCountries());
	    return "scoreBoardMain";
	}
	
	
	/**
	 * This method add new match into summary and return to URL to the view 'scoreBoardMain'.
	 * 
	 * @return The logical name of the view to be returned.
	 */
    @RequestMapping(value = "/addMatch", method = RequestMethod.POST)
	public String addMatch(@ModelAttribute("match") Match match,Model model) {
		
    	match.setHomeTeamScore(match.generateRandomScore());
    	match.setAwayTeamScore(match.generateRandomScore());
    	
    	
		this.matchesManager.getSummary().add(match);
		
		//Load countries
		model.addAttribute("countries",CountriesUtils.getCountries());
		//Load matches list
		model.addAttribute("matches",this.matchesManager.getSummary());
		
		
	    return "scoreBoardMain";
	}
	
	
}