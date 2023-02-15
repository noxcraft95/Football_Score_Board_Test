package com.example.footballscoreboard.matches;

/**
 * This class represents instances of football matches.
 * It contains information about the home team, away team, 
 * and their respective scores.
 */
public class Match {
	//Attributes
	private int id;
	
	private String homeTeam;
	
	private String awayTeam;
	
	private int homeTeamScore;
	
	private int awayTeamScore;
	
	private int totalScore;
	//Constructors
	
	/** Constructor for the Match class.
	 * 
	@param id identificator of the match
	@param homeTeam the name of the home team
	@param awayTeam the name of the away team
	@param homeTeamScore the score of the home team
	@param awayTeamScore the score of the away team
	*/
	public Match(int id,String homeTeam, String awayTeam, int homeTeamScore, int awayTeamScore) {
		this.id = id;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;
		
		this.totalScore = homeTeamScore + awayTeamScore;
	}

	//Methods
	
	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomeTeamScore() {
		return homeTeamScore;
	}

	public void setHomeTeamScore(int homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}

	public int getAwayTeamScore() {
		return awayTeamScore;
	}

	public void setAwayTeamScore(int awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}

	public int getTotalScore() {
		return totalScore;
	}
	

	
}
