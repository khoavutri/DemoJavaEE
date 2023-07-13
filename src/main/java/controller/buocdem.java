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
import util.guimail;
import util.random;

/**
 * Servlet implementation class buocdem
 */
@WebServlet("/buocdem")
public class buocdem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buocdem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession ss = request.getSession();
	String s = (String) request.getParameter("from");
	String co = random.sett();
	ss.setAttribute("code", co);
	String url = "/trinhtaoma.jsp";
		if (s.equals("dangky1")) {
			ss.setAttribute("from", "dangky");
			ss.setAttribute("ttendangnhap", (String)request.getParameter("username"));
			ss.setAttribute("tmatkhau",(String)request.getParameter("password"));
			ss.setAttribute("temail",(String)request.getParameter("email"));
			ss.setAttribute("tsodienthoai",(String)request.getParameter("phone"));
			ss.setAttribute("thovaten",(String)request.getParameter("fullname"));
			ss.setAttribute("tgioitinh",(String)request.getParameter("gender"));
			ss.setAttribute("tdiachi",(String)request.getParameter("address"));
			ss.setAttribute("tdiachinhanhang",(String)request.getParameter("shipping_address"));
			ss.setAttribute("tdiachimuahang",(String)request.getParameter("billing_address"));
			
			ss.setAttribute("tngaysinh",request.getParameter("dob"));
			
			if((khachhangdao.selectBytendangnhap( (String)request.getParameter("username"))!=null)  )          
			{
				url = "/dangky.jsp";
			
				request.setAttribute("cucu", "yep");
				
				
			}
			if(khachhangdao.selectByemail((String)request.getParameter("email"))!=null) {
				url = "/dangky.jsp";
				
				request.setAttribute("cuca", "yep");
			
			}
			if (!url.equals("/dangky.jsp")) {
				ss.setAttribute("too",(String)request.getParameter("email"));
				guimail.sendEmail((String)request.getParameter("email"), "Mã xác thực của khoa:", co);
			}
		}
		
		if (s.equals("quenmatkhau1")) {
			ss.setAttribute("from", "quenmatkhau");
			String email = (String)request.getParameter("email");
			String tendangnhap = (String)request.getParameter("username");
			khachhang kh1 = khachhangdao.selectByemail(email);
			khachhang kh2 = khachhangdao.selectBytendangnhap(tendangnhap);
			if ((kh1==null)||(kh2==null)) {
				request.setAttribute("caca", "yep");
				url = "/quenmatkhau.jsp";
			} else if ((!kh1.getTendangnhap().equals(tendangnhap))) {
				request.setAttribute("caca", "yep");
				url = "/quenmatkhau.jsp";
			}
			if (!url.equals("/quenmatkhau.jsp")) {
			ss.setAttribute("qemail", email);
			ss.setAttribute("too", email);
			guimail.sendEmail(email, "Mã xác thực của khoa:", co);
			
			}
			
			
		} 
		
		if (s.equals("doimatkhau1")) {
			khachhang k = khachhangdao.selectById((String)ss.getAttribute("iidd"));
			ss.setAttribute("from", "doimatkhau");
			String mkc = request.getParameter("old-password");
			ss.setAttribute("dpass", (String)request.getParameter("new-password"));
			if (!mkc.equals(k.getMatkhau())) {
			request.setAttribute("coco", "yep");
			url ="/doimatkhau.jsp";
			}
			ss.setAttribute("too", k.getEmail());
			
			if (url!="/doimatkhau.jsp") {
			guimail.sendEmail(k.getEmail(), "Mã xác thực của khoa:", co);
			}
		} 
		
	
		if (s.equals("capnhapthongtin1")) {
			ss.setAttribute("from","capnhapthongtin" );
			String hovaten=(String)request.getParameter("fullname");
			String gioitinh = (String)request.getParameter("gender");
			Date ngaysinh = Date.valueOf((String)request.getParameter("birthday"));
			String sodienthoai=  (String)request.getParameter("bi");
			String diachi=  (String)request.getParameter("address");
			String diachinhanhang=  (String)request.getParameter("shipping_address");
			String diachimuahang = (String)request.getParameter("billing_address");
			String makhachhang = (String) ss.getAttribute("iidd");
			String tendangnhap = (String) khachhangdao.selectById((String)ss.getAttribute("iidd")).getTendangnhap();
			String matkhau = (String) khachhangdao.selectById((String)ss.getAttribute("iidd")).getMatkhau();
			String email = (String) khachhangdao.selectById((String)ss.getAttribute("iidd")).getEmail();
			
	
			khachhang k = new khachhang(makhachhang,tendangnhap,matkhau,hovaten,gioitinh,diachi,diachinhanhang,
					diachimuahang,ngaysinh,sodienthoai,email);
			ss.setAttribute("concon", k);
			
			ss.setAttribute("too", (String)khachhangdao.selectById((String)ss.getAttribute("iidd")).getEmail());
			guimail.sendEmail((String)khachhangdao.selectById((String)ss.getAttribute("iidd")).getEmail(), "Mã xác thực của khoa:", co);
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
	public static void main(String[] args) {
	
	}

}
