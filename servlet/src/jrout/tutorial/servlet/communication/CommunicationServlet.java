package jrout.tutorial.servlet.communication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommunicationServlet
 */
@WebServlet("/CommunicationServlet")
public class CommunicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		int age = Integer.parseInt(request.getParameter("age"));
		
		String value = "Your age is " + age;
		
		List name = new ArrayList();
		name.add("One");
		name.add("Two");
		
		request.setAttribute("ageString", value);
		request.setAttribute("names", name);
		
		// Query a db and get some values also.
		
		/*RequestDispatcher header = request.getRequestDispatcher("Header");
		header.include(request, response);*/
		
		RequestDispatcher main = request.getRequestDispatcher("Main");
		main.include(request, response);
		
		/*RequestDispatcher footer = request.getRequestDispatcher("Footer");
		footer.include(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
