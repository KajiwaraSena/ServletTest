package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class contact
 */
@WebServlet("/servlet/contact")
public class contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		response.setContentType("text:html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
	try {
		String name = request.getParameter("name");
		String ofice = request.getParameter("ofice");
		String mail = request.getParameter("mail");
		String naiyou = request.getParameter("naiyou");
		String[] maga = request.getParameterValues("maga");
		String qes = request.getParameter("qes");
		
		request.setAttribute("name", name);
		request.setAttribute("ofice", ofice);
		request.setAttribute("mail", mail);
		request.setAttribute("naiyou", naiyou);
		request.setAttribute("maga", maga);
		request.setAttribute("qes", qes);
				
		if(qes.equals("Yes")) {
			request.getRequestDispatcher("../jsp/contact2.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("../jsp/contact1.jsp").forward(request, response);
		}
	}catch(Exception e){
			out.println(e);
		}
		
		Page.footer(out);
	}
}
