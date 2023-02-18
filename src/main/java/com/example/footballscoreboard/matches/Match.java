package com.example.footballscoreboard.matches;

import java.util.Random;

/**
 * This class represents instances of football matches. It contains information
 * about the home team, away team, and their respective scores.
 */
public class Match {
	// Attributes
	private int id;

	private String homeTeam;

	private String awayTeam;

	private Integer homeTeamScore;

	private Integer awayTeamScore;

	private Integer totalScore;

	private static int idCounter = 0;

	private final int MAX_SCORE = 6;

	// Constructors

	/**
	 * Constructor for the Match class.
	 * 
	 * @param id            identificator of the match
	 * @param homeTeam      the name of the home team
	 * @param awayTeam      the name of the away team
	 * @param homeTeamScore the score of the home team
	 * @param awayTeamScore the score of the away team
	 */
	public Match(String homeTeam, String awayTeam, Integer homeTeamScore, Integer awayTeamScore) {
		this.id = generateID();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;

		this.totalScore = homeTeamScore + awayTeamScore;
	}
	
	// Methods
	//Generates a number between 0 and MAX_SCORE (being more probably to be between 0 and 3 scores)
	public int generateRandomScore() {

		Random random = new Random();
		int firstNumber = random.nextInt(2);
		int secondNumber = 0;
		if (firstNumber == 1) {
			secondNumber = random.nextInt(3);
		} else {
			secondNumber = random.nextInt(MAX_SCORE - firstNumber) + firstNumber;
		}
		return secondNumber;
	}

	

	public static int generateID() {
		return ++idCounter;
	}

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

	public Integer getHomeTeamScore() {
		return homeTeamScore;
	}

	public void setHomeTeamScore(Integer homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
		this.totalScore = this.homeTeamScore + this.awayTeamScore;
	}

	public Integer getAwayTeamScore() {
		return awayTeamScore;
	}

	public void setAwayTeamScore(Integer awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
		this.totalScore = this.homeTeamScore + this.awayTeamScore;
	
	}

	public Integer getTotalScore() {
		return totalScore;
	}

}
