package jrout.tutorial.servlet.communication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Header
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
//		out.println("Hello This is for main Subject" + request.getParameter("name")+"<br>");
		HttpSession session = request.getSession(true);
		
		/*String ageStr = (String)request.getAttribute("ageString");
		out.println(ageStr+"<br>");
		
		List<String> names = (List<String>)request.getAttribute("names");
		
		for(String name : names) {
			out.println(name);
		}*/
		String fname = request.getParameter("name");
		
		/*List<String> namesFromSession = (List<String>) session
				.getAttribute("names");*/
		
		List<String> namesFromSession = (List<String>) getServletContext()
				.getAttribute("names");
		
		for (String str : namesFromSession) {
			if (fname.equals(str)) {
				out.println("You are there in the DB");
				break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
