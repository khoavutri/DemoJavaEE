package controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.khachhangdao;

/**
 * Servlet implementation class dangnhap
 */
@WebServlet("/dangnhap")
public class dangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String user = (String) request.getParameter("uname");
	String pass = (String) request.getParameter("psw");
	String url ="/dangnhap.jsp";
	HttpSession session = request.getSession();
	if (khachhangdao.selectbynhap(user, pass)!=null) {
		url = "/NewFile.jsp";
		request.setAttribute("mou", "1");
		
		session.setAttribute("iidd", khachhangdao.selectbynhap(user, pass).getMakhachhang());
	} else {
		request.setAttribute("mou", "0");
	}
	
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
