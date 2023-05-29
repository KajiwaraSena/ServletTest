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
 * Servlet implementation class Form
 */
@WebServlet("/servlet/form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		response.setContentType("text:html; charset=UTF-8");
		String[] annai = request.getParameterValues("checkbox");
		String annais ="";
		String[] q = request.getParameterValues("qes");
		
		if(annai != null) {
			for(int i = 0; i < annai.length; i++) {
				annais =annais +"「"+annai[i]+"」 "+" ";}request.setAttribute("annais", annais);
			}else {
				annais = "";
				request.setAttribute("annais", annais);
		}

		
		if(q.equals("No")) {
			request.getRequestDispatcher("contact1.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("contact2.jsp").forward(request, response);
		}
		
		Page.footer(out);
	}

}

