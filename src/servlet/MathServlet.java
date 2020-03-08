package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathServlet
 */
@WebServlet("/math")
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MathServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("Dadada");
		boolean signal=true;
		String parametaraA = request.getParameter("a");
		try {
			if (parametaraA.isEmpty())
				throw new Exception("Insert number");
               a=Integer.parseInt(parametaraA);
               //proslo
		} catch (Exception e) {
			signal=false;
			// ili je null ili nije uneo broj
			System.out.println("Da");
			request.setAttribute("errorA", "A is not number");
		}
		String parametaraB = request.getParameter("b");
		try {
			if (parametaraB.isEmpty())
				throw new Exception("Insert number");
               b=Integer.parseInt(parametaraB);
               //proslo
		} catch (Exception e) {
			signal=false;
			// ili je null ili nije uneo broj
			request.setAttribute("errorB", "B is not number");
		}
if (signal) {
	//saberi ili oduzmi
	if (request.getParameter("plus")!=null) {
		c=a+b;
	}else if (request.getParameter("minus")!=null) {
		c=a-b;
	}
	request.setAttribute("c", c);	
	
	
		
	
	
}
request.setAttribute("parametaraA",parametaraA );
request.setAttribute("parametaraB", parametaraB);
request.setAttribute("c", c);
		RequestDispatcher rd = request.getRequestDispatcher("math.jsp");
		rd.forward(request, response);

	}

}
