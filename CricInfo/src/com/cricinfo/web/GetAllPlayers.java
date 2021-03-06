/**
 * 
 */
package com.cricinfo.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cricinfo.entity.Player;
import com.cricinfo.jdbc.dao.PlayerDAO;
import com.cricinfo.jdbc.dao.impl.PlayerDAOImpl;

/**
 * @author athar
 *
 */


@WebServlet("/getAllPlayers")
public class GetAllPlayers extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
/*		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");*/
		
		PlayerDAO playerService = new PlayerDAOImpl();
		ArrayList<Player> players =  playerService.getAllPlayer();
		request.setAttribute("players", players);
		
/*		out.print("Players List <br />");
		out.print("<table border=\"1\">");
		out.print("<tr>");
		out.print("<th>ID</th><th>Name</th><th>DOB</th><th>Country</th>");
		out.print("</tr>");
		
		for(Player p : players){					
			out.print("<tr>");
			out.print("<td>" + p.getId() + "</td>");
			out.print("<td>" + p.getFirstName() + " " + p.getLastName() + "</td>");
			out.print("<td>" + p.getDob() + "</td>");
			out.print("<td>" + p.getCountry().getShortName() + "</td>");
			out.print("</tr>");		
		}
		out.print("</table>");
		out.print("</body></html>");
*/
        request.getRequestDispatcher("playersDetails.jsp").forward(request, response);;
	}

}
