package com.example.footballscoreboard.matches;

import java.util.Collections;
import java.util.LinkedList;


public class MatchesManager {
	
	private LinkedList<Match> matchesSummary;
	
	public MatchesManager() {
		this.matchesSummary = new LinkedList<Match>();
	}
	
	public LinkedList<Match> getSummary(){
		return orderSummary();
	}
	
	private LinkedList<Match> orderSummary(){
		Collections.sort(this.matchesSummary, new MatchComparator()); 
		return this.matchesSummary;
	}

}
