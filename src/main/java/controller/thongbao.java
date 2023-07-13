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
import util.guimail;

/**
 * Servlet implementation class thongbao
 */
@WebServlet("/thongbao")
public class thongbao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thongbao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	HttpSession ss = request.getSession();
	String id = (String) ss.getAttribute("iidd");
	String url = "/NewFile.jsp";
	khachhang k = khachhangdao.selectById(id);
	
	guimail.sendEmail(k.getEmail(), "Thông báo của bạn:", "Cảm ơn bạn "+k.getHovaten()+ " đã sử dụng dịch vụ của chúng tôi");
	request.setAttribute("khoa", "yep");
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
