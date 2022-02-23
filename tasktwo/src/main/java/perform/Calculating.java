package perform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Calculating extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculating() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
response.setContentType("text/html");
		
		PrintWriter out = null;
		
		
		
		try {
			out = response.getWriter();
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			int c= 0;
			
			String op = request.getParameter("btn");
			
			if (op.equals("+")) c = num1 + num2;
			if (op.equals("-")) c = num1 - num2;
			if (op.equals("*")) c = num1 * num2;
			if (op.equals("/")) c = num1 / num2;
			
			out.println("<center class='mt-5'><h1> Answer </h1></center>");
			out.println("<center><h3>"+num1 + op + num2+"=" + c +"</h3></center>");
			
			
			
			
		}catch(Exception e) {
				out.println("Error:"+e.getMessage());
		}
		finally {
				out.println("");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
