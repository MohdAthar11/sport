/**
 * 
 */
package com.cricinfo.jdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cricinfo.jdbc.dao.MatchDAO;
import com.cricinfo.jdbc.utils.JDBCUtils;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * @author atharS
 *
 */
public class MatchDAOImpl implements MatchDAO{

		@Override
		public Match getMatchByCountry(String country) {
		Match match = new Match();
		Statement stmt = null;
		String sql = "SELECT * FROM match WHERE id = " + country;
			

		try {
			stmt = JDBCUtils.getConnection().createStatement();

			ResultSet rs = stmt.executeQuery(sql);
				
			while(rs.next()){
					
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return null;
		}
		@Override
		public ArrayList<Match> getMatchesByFormat(String format_id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<Match> getMatchesByLocation(String location) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Match getWinningTeamInMatch() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void addMatch(String match) {
			// TODO Auto-generated method stub
			
		}
}