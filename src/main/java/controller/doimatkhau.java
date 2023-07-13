package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.khachhangdao;

/**
 * Servlet implementation class doimatkhau
 */
@WebServlet("/doimatkhau")
public class doimatkhau extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doimatkhau() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/NewFile.jsp";
		HttpSession ss = request.getSession();
		String pass = (String) ss.getAttribute("dpass");
		String id = (String) ss.getAttribute("iidd");
		khachhangdao.change(id, pass);
		
		ss.invalidate();
		HttpSession ump = request.getSession();
		ump.setAttribute("iidd", id);
		
		request.setAttribute("doimatkhauthanhcong", "yep");
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
				
				
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
