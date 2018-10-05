/**
 * 
 */
package com.cricinfo.jdbc.dao;

import java.util.ArrayList;

import com.cricinfo.entity.Player;

/**
 * @author athar
 *
 */
public interface PlayerDAO {
	
	public Player getPlayerById(String id);
	public ArrayList<Player> getPlayersByCountry(String country);
	public ArrayList<Player> getPlayersByName(String name);
	public void addPlayer(Player player);
	public ArrayList<Player> getAllPlayer();
	public void delete(String id);
	}
	
	
