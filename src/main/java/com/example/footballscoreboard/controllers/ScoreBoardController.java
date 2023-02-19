package com.example.footballscoreboard.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.footballscoreboard.matches.Match;
import com.example.footballscoreboard.matches.MatchesManager;
import com.example.footballscoreboard.utils.CountriesUtils;


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

		// Load matches
		model.addAttribute("matches", this.matchesManager.getSummary());
		// Load countries
		model.addAttribute("countries", CountriesUtils.getCountries());
		
		return "scoreBoardMain";
	}

	/**
	 * This method add new match into summary and return to URL to the view
	 * 'scoreBoardMain'.
	 * 
	 * @return The logical name of the view to be returned.
	 */
	@RequestMapping(value = "/addMatch", method = RequestMethod.POST)
	public String addMatch(@ModelAttribute("match") Match match, RedirectAttributes redirectAttributes) {
		
		//check if home team and away team is not same team
		if(!match.getHomeTeam().equals(match.getAwayTeam())) {
			match.setHomeTeamScore(match.generateRandomScore());
			match.setAwayTeamScore(match.generateRandomScore());
			this.matchesManager.getSummary().add(match);
			redirectAttributes.addFlashAttribute("successMatch", "Match added successfully! " + match.getHomeTeam() + " - "
					+ match.getAwayTeam() + ": [" + match.getHomeTeamScore() + ":" + match.getAwayTeamScore() + "]");
		}else {
			redirectAttributes.addFlashAttribute("failMatch", "Cannot add two equal teams");
		}
		
		return "redirect:/";
	}

}