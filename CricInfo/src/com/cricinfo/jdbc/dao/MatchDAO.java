/**
 * 
 */
package com.cricinfo.jdbc.dao;

import java.util.ArrayList;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * @author athar
 *
 */
public interface MatchDAO {
	public Match getMatchByCountry(String country);
	public ArrayList<Match> getMatchesByFormat(String format_id);
	public ArrayList<Match> getMatchesByLocation(String location);
	public Match getWinningTeamInMatch();
	public void addMatch(String match);
	
	
}
