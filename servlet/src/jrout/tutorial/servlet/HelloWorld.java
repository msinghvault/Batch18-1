package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorldIPhone")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("HelloWorld.init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("HelloWorld.destroy()");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HelloWorld.service()");
		String name = request.getParameter("name");
		String lname = request.getParameter("lastname");
		
		PrintWriter out = response.getWriter();
		
		String salary = request.getParameter("salary");
		
		ArrayList list = new ArrayList();
		
		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		
		out.println("<body>");
		out.println("<table>");
		for(int i = 0 ; i < list.size() ; i++){
			out.println("<tr><td>"+list.get(i)+"</td><td>32</td></tr>");	
		}
		
		out.println("</table>");
		out.println("</body>");
	
		
		
	}

}
