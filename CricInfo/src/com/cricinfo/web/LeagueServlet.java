/**
 * 
 */
package com.cricinfo.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cricinfo.entity.League;
import com.cricinfo.entity.Player;
import com.cricinfo.jdbc.dao.LeagueDAO;
import com.cricinfo.jdbc.dao.PlayerDAO;
import com.cricinfo.jdbc.dao.impl.LeagueDAOImpl;
import com.cricinfo.jdbc.dao.impl.PlayerDAOImpl;

/**
 * @author athar
 *
 */

@WebServlet("/leagues")
public class LeagueServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		LeagueDAO leagueService = new LeagueDAOImpl();
		ArrayList<League> leagues = leagueService.getLeagues();

		request.setAttribute("leagues", leagues);
		request.getRequestDispatcher("leagues.jsp").forward(request, response);
		;
	}

}
