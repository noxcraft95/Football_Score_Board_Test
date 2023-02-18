package com.example.footballscoreboard.matches;

import java.util.Comparator;

/** A comparator for sorting Match objects in descending order of their totalScore attribute.*/
public class MatchComparator implements Comparator<Match> {
	
    @Override
    public int compare(Match m1, Match m2) {
    	  if (m1.getTotalScore() < m2.getTotalScore()) {
              return 1;
          } else if (m1.getTotalScore() > m2.getTotalScore()) {
              return -1;
          } else {
              return 0;
          }
    }
}