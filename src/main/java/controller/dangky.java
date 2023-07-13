package controller;

import java.io.IOException;
import java.sql.Date;

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
 * Servlet implementation class dangky
 */
@WebServlet("/dangky")
public class dangky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangky() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/dangnhap.jsp";
	HttpSession ss = request.getSession();
	Long t = khachhangdao.soluong()+1;
	String makhachhang = "kh"+t;
	

	
	String tendangnhap =(String) ss.getAttribute("ttendangnhap");
	String matkhau =(String) ss.getAttribute("tmatkhau");
	String hovaten = (String) ss.getAttribute("thovaten");
	String giotinh = (String) ss.getAttribute("tgioitinh");
	String diachi = (String) ss.getAttribute("tdiachi");
	String diachinhanhang = (String) ss.getAttribute("tdiachinhanhang");
	String diachimuahang = (String) ss.getAttribute("tdiachimuahang");
	String ngaysinh = (String) ss.getAttribute("tngaysinh");
	String sodienthoai = (String) ss.getAttribute("tsodienthoai");
	String email = (String) ss.getAttribute("temail");
		
	khachhang k = new khachhang(makhachhang,tendangnhap,matkhau,hovaten,giotinh,diachi,diachinhanhang,diachimuahang,Date.valueOf(ngaysinh),sodienthoai,email);
		khachhangdao.insertt(k);
	ss.invalidate();
	request.setAttribute("dangkythanhcong", "yeb");
	
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
