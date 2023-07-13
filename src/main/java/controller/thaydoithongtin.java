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
import model.khachhang;

/**
 * Servlet implementation class thaydoithongtin
 */
@WebServlet("/thaydoithongtin")
public class thaydoithongtin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thaydoithongtin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ss = request.getSession();
		khachhang k = (khachhang)ss.getAttribute("concon");
		String url = "/NewFile.jsp";
		khachhangdao.updatee(k);
		ss.invalidate();
		HttpSession so = request.getSession();
		so.setAttribute("iidd", k.getMakhachhang());
		
		request.setAttribute("cpc", "yep");
		
		RequestDispatcher rds = getServletContext().getRequestDispatcher(url);
		rds.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
