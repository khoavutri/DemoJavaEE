package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import model.khachhang;


public class khachhangdao {
	
	public static ArrayList<khachhang> selectall(){
		ArrayList<khachhang> ketqua = new ArrayList<>();
		Connection c = JDBCUtil.getcon();
		
		String sql = "SELECT * FROM khachhang";
		
	try {
		PreparedStatement st = c.prepareStatement(sql);
		ResultSet rs= st.executeQuery();
		while (rs.next()) {
			String maKhacHang = rs.getString("makhachhang");
			String tenDangNhap = rs.getString("tendangnhap");
			String matKhau = rs.getString("matkhau");
			String hoVaTen = rs.getString("hovaten");
			String gioiTinh = rs.getString("gioitinh");
			String diaChi = rs.getString("diachi");
			String diaChiNhanHang = rs.getString("diachinhanhang");
			String diaChiMuaHang = rs.getString("diachimuahang");
			Date ngaySinh = rs.getDate("ngaysinh");
			String soDienThoai = rs.getString("sodienthoai");
			String email = rs.getString("email");
			khachhang kh = new khachhang(maKhacHang,tenDangNhap,matKhau,
					hoVaTen,gioiTinh,diaChi,diaChiNhanHang,diaChiMuaHang,ngaySinh,
					soDienThoai,email);
			ketqua.add(kh);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JDBCUtil.closecon(c);
		return ketqua;
		
	}
	
	public static khachhang selectbynhap(String user,String pass) {
		Connection c = JDBCUtil.getcon();
		String sql = "SELECT * FROM khachhang WHERE tendangnhap=? AND matkhau=?";
		khachhang kh = null;
		try {
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, user);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			
			if (rs.next()) {;
			String maKhacHang = rs.getString("makhachhang");
			String tenDangNhap = rs.getString("tendangnhap");
			String matKhau = rs.getString("matkhau");
			String hoVaTen = rs.getString("hovaten");
			String gioiTinh = rs.getString("gioitinh");
			String diaChi = rs.getString("diachi");
			String diaChiNhanHang = rs.getString("diachinhanhang");
			String diaChiMuaHang = rs.getString("diachimuahang");
			Date ngaySinh = rs.getDate("ngaysinh");
			String soDienThoai = rs.getString("sodienthoai");
			String email = rs.getString("email");
			 kh = new khachhang(maKhacHang,tenDangNhap,matKhau,
					hoVaTen,gioiTinh,diaChi,diaChiNhanHang,diaChiMuaHang,ngaySinh,
					soDienThoai,email);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtil.closecon(c);
	return kh;	
	}
	

	public static long soluong () {
		long dem = 0;
		Connection c = JDBCUtil.getcon();
		
		String sql = "SELECT COUNT(*) FROM khachhang;";
		
		try {
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			rs.next();
			dem = rs.getLong(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtil.closecon(c);
		return dem;
	}

	public static int insertt(khachhang t) {
		int kt =0;
		Connection c =JDBCUtil.getcon();
		String sql = "INSERT INTO khachhang (makhachhang, tendangnhap, matkhau, hovaten, gioitinh, diachi, diachinhanhang, diachimuahang, ngaysinh, sodienthoai, email) "
				+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, t.getMakhachhang());
			st.setString(2, t.getTendangnhap());
			st.setString(3, t.getMatkhau());
			st.setString(4, t.getHovaten());
			st.setString(5, t.getGioitinh());
			st.setString(6, t.getDiachi());
			st.setString(7, t.getDiachinhanhang());
			st.setString(8, t.getDiachimuahang());
			st.setDate(9, t.getNgaysinh());
			st.setString(10, t.getSodienthoai());
			st.setString(11, t.getEmail());
			kt = st.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtil.closecon(c);
		return kt;
		
	}
public static int updatee(khachhang t) {
	int ketQua = 0;
	try {
		
		Connection c = JDBCUtil.getcon();

	
		String sql = "UPDATE khachhang " + " SET " + " hovaten=?" + ", gioitinh=?"
				+ ", diachi=?" + ", diachinhanhang=?" + ", diachimuahang=?" + ", ngaysinh=?" + ", sodienthoai=?"
				 + " WHERE makhachhang=?";

		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, t.getHovaten());
		st.setString(2, t.getGioitinh());
		st.setString(3, t.getDiachi());
		st.setString(4, t.getDiachinhanhang());
		st.setString(5, t.getDiachimuahang());
		st.setDate(6, t.getNgaysinh());
		st.setString(7, t.getSodienthoai());
		
		st.setString(8, t.getMakhachhang());
		

		System.out.println(sql);
		ketQua = st.executeUpdate();

		JDBCUtil.closecon(c);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return ketQua;	
}

public static int change(String mkh,String pass) {
	int kt = 0;
	
	try {
		Connection c = JDBCUtil.getcon();
		String sql = "UPDATE khachhang " + " SET "+" matkhau=? "+"WHERE makhachhang=?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, pass);
		st.setString(2, mkh);
		kt = st.executeUpdate();
		JDBCUtil.closecon(c);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return kt;
}
	
public static khachhang selectById(String t) {
	khachhang ketQua = null;
	try {
		
		Connection con = JDBCUtil.getcon();

		String sql = "SELECT * FROM khachhang WHERE makhachhang=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, t);

		
	
		ResultSet rs = st.executeQuery();

		rs.next();
			String maKhacHang = rs.getString("makhachhang");
			String tenDangNhap = rs.getString("tendangnhap");
			String matKhau = rs.getString("matkhau");
			String hoVaTen = rs.getString("hovaten");
			String gioiTinh = rs.getString("gioitinh");
			String diaChi = rs.getString("diachi");
			String diaChiNhanHang = rs.getString("diachinhanhang");
			String diaChiMuaHang = rs.getString("diachimuahang");
			Date ngaySinh = rs.getDate("ngaysinh");
			String soDienThoai = rs.getString("sodienthoai");
			String email = rs.getString("email");
			

			ketQua = new khachhang(maKhacHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang,
					diaChiMuaHang, ngaySinh, soDienThoai, email);
		

		// Bước 5:
		JDBCUtil.closecon(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return ketQua;
}
public static khachhang selectByemail(String t) {
	khachhang ketQua = null;
	try {
		
		Connection con = JDBCUtil.getcon();

		String sql = "SELECT * FROM khachhang WHERE email=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, t);

		
	
		ResultSet rs = st.executeQuery();

		rs.next();
			String maKhacHang = rs.getString("makhachhang");
			String tenDangNhap = rs.getString("tendangnhap");
			String matKhau = rs.getString("matkhau");
			String hoVaTen = rs.getString("hovaten");
			String gioiTinh = rs.getString("gioitinh");
			String diaChi = rs.getString("diachi");
			String diaChiNhanHang = rs.getString("diachinhanhang");
			String diaChiMuaHang = rs.getString("diachimuahang");
			Date ngaySinh = rs.getDate("ngaysinh");
			String soDienThoai = rs.getString("sodienthoai");
			String email = rs.getString("email");
			

			ketQua = new khachhang(maKhacHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang,
					diaChiMuaHang, ngaySinh, soDienThoai, email);
		

		// Bước 5:
		JDBCUtil.closecon(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return ketQua;
}
public static khachhang selectBytendangnhap(String t) {
	khachhang ketQua = null;
	try {
		
		Connection con = JDBCUtil.getcon();

		String sql = "SELECT * FROM khachhang WHERE tendangnhap=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, t);

		
	
		ResultSet rs = st.executeQuery();

		rs.next();
			String maKhacHang = rs.getString("makhachhang");
			String tenDangNhap = rs.getString("tendangnhap");
			String matKhau = rs.getString("matkhau");
			String hoVaTen = rs.getString("hovaten");
			String gioiTinh = rs.getString("gioitinh");
			String diaChi = rs.getString("diachi");
			String diaChiNhanHang = rs.getString("diachinhanhang");
			String diaChiMuaHang = rs.getString("diachimuahang");
			Date ngaySinh = rs.getDate("ngaysinh");
			String soDienThoai = rs.getString("sodienthoai");
			String email = rs.getString("email");
			

			ketQua = new khachhang(maKhacHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang,
					diaChiMuaHang, ngaySinh, soDienThoai, email);
		

		// Bước 5:
		JDBCUtil.closecon(con);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return ketQua;
}

}
