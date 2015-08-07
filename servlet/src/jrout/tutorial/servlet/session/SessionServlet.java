package jrout.tutorial.servlet.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("name");
		
		ServletContext context = getServletContext();
		
		
		if (session.isNew()) {
			out.println("Hi , Welcome " + fname + " to new Session");
		} else {
			out.println(fname + " You are an existing session");
		}
		if(request.getParameter("logout") == "logout") {
			session.invalidate();
		}
		/*List<String> names = (List<String>) session
				.getAttribute("names");*/
		
		List<String> names = (List<String>) context
				.getAttribute("names");

		if (names == null) {
			names = new ArrayList();
			names.add("ONE");
			names.add("Jayram");
			names.add("Testing");

//			session.setAttribute("names", names);
			context.setAttribute("names", names);
			
			context.setAttribute("companyName", "H2kInfosys");
		}
		
		RequestDispatcher main = request.getRequestDispatcher("Main");
		main.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
