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
import util.guimail;
import util.random;

/**
 * Servlet implementation class trinhtaoma
 */
@WebServlet("/trinhtaoma")
public class trinhtaoma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public trinhtaoma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="";
		String s1 = (String) request.getParameter("text-input");
		HttpSession ss = request.getSession();
		String s2 = (String) ss.getAttribute("code");
		String so = (String) ss.getAttribute("from");
		if (s1.equals(s2)) {
		
			if (so.equals("dangky")) {
				url = "/dangky";
			}
			
			if (so.equals("quenmatkhau")) {
				ss.setAttribute("cuid",khachhangdao.selectByemail((String) ss.getAttribute("qemail")).getMakhachhang());
				url = "/quenmatkhau1.jsp";
			}
			
			if (so.equals("doimatkhau")) {
				url = "/doimatkhau";
			}
			
			if (so.equals("capnhapthongtin")) {
				url = "/thaydoithongtin";
			}
			
			
		} else {
			String co = random.sett();
			ss.setAttribute("code", co);
			url = "/trinhtaoma.jsp";
			guimail.sendEmail((String)ss.getAttribute("too"), "Mã xác thực của khoa:", co);
			
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
