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

import com.cricinfo.entity.Country;
import com.cricinfo.entity.League;
import com.cricinfo.entity.Player;
import com.cricinfo.jdbc.dao.CountryDAO;
import com.cricinfo.jdbc.dao.LeagueDAO;
import com.cricinfo.jdbc.dao.PlayerDAO;
import com.cricinfo.jdbc.dao.impl.CountryDAOImpl;
import com.cricinfo.jdbc.dao.impl.LeagueDAOImpl;
import com.cricinfo.jdbc.dao.impl.PlayerDAOImpl;

/**
 * @author athar
 *
 */


@WebServlet("/addPlayer")
public class AddPlayerServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		Player player = new Player();
		player.setId((String) request.getParameter("id"));
		player.setFirstName((String) request.getParameter("firstname"));
		player.setLastName((String) request.getParameter("lastname"));
		
		Country country = new Country();
		country.setId((String) request.getParameter("countryid"));
		
		player.setCountry(country);
		
		PlayerDAO playerService = new PlayerDAOImpl();

		playerService.addPlayer(player);;

		response.sendRedirect("success.jsp");
	}

}
