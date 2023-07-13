package database;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.cj.jdbc.Driver;
import model.anh;
import model.khachhang;

public class anhdao {
	public static ArrayList<anh> selectall(){
		ArrayList<anh> ketqua = new ArrayList<>();
		Connection c = JDBCUtil.getcon();
		
		String sql = "SELECT * FROM newanh";
		
	try {
		PreparedStatement st = c.prepareStatement(sql);
		ResultSet rs= st.executeQuery();
		while (rs.next()) {
			String link = rs.getString("link");
			String ten = rs.getString("name");
			String mota = rs.getString("mota");
			String id = rs.getString("idsanpham");
		
			
			
			anh kh = new anh(link,id,ten,mota);
			
			ketqua.add(kh);
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JDBCUtil.closecon(c);
		return ketqua;
		
	}
	
	public static int insertt(anh t) {
		int kt =0;
		Connection c =JDBCUtil.getcon();
		String sql = "INSERT INTO newanh (link, name, mota, idsanpham) "
				+ " VALUES (?,?,?,?)";
		try {
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, t.getLink());
			st.setString(2, t.getTensp());
			st.setString(3, t.getMota());
			st.setString(4, t.getIdsanpham());
		
			kt = st.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		JDBCUtil.closecon(c);
		return kt;
		
	}
	
	public static anh selectById(String t) {
		anh ketQua = null;
		try {
			
			Connection con = JDBCUtil.getcon();

			String sql = "SELECT * FROM newanh WHERE idsanpham=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);

			
		
			ResultSet rs = st.executeQuery();
			 
			rs.next();
				String link = rs.getString("link");
				String name = rs.getString("name");
				String mota = rs.getString("mota");
				String idsanpham = rs.getString("idsanpham");
				
				

				ketQua = new anh(link,idsanpham,name,mota);
			

			// Bước 5:
			JDBCUtil.closecon(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}
	public static anh selectBylink(String t) {
		anh ketQua = null;
		try {
			
			Connection con = JDBCUtil.getcon();

			String sql = "SELECT * FROM newanh WHERE link=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t);

			ResultSet rs = st.executeQuery();
			 
			rs.next();
				String link = rs.getString("link");
				String name = rs.getString("name");
				String mota = rs.getString("mota");
				String idsanpham = rs.getString("idsanpham");
			
				

				ketQua = new anh(link,idsanpham,name,mota);
			

			// Bước 5:
			JDBCUtil.closecon(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	public static long soluong () {
		long dem = 0;
		Connection c = JDBCUtil.getcon();
		
		String sql = "SELECT COUNT(*) FROM newanh;";
		
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

	
}
