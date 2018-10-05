/**
 * 
 */
package com.cricinfo.jdbc.dao;

import java.util.ArrayList;

import com.cricinfo.entity.League;

/**
 * @author athar
 *
 */
public interface LeagueDAO {
	public ArrayList<League> getLeagues();
	public void addLeague(League league); 
	public void delete(String id);
		
	}
	

