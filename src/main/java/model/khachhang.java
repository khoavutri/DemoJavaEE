package model;

import java.sql.Date;
public class khachhang {
 private String Makhachhang;
 private String Tendangnhap;
 private String Matkhau;
 private String Hovaten;
 private String Gioitinh;
 private String Diachi;
 private String Diachinhanhang;
 private String Diachimuahang;
 private Date Ngaysinh;
 private String Sodienthoai;
 private String Email;

public khachhang() {
	
}

public khachhang(String makhachhang, String tendangnhap, String matkhau, String hovaten, String gioitinh, String diachi,
		String diachinhanhang, String diachimuahang, Date ngaysinh, String sodienthoai, String email) {
	super();
	Makhachhang = makhachhang;
	Tendangnhap = tendangnhap;
	Matkhau = matkhau;
	Hovaten = hovaten;
	Gioitinh = gioitinh;
	Diachi = diachi;
	Diachinhanhang = diachinhanhang;
	Diachimuahang = diachimuahang;
	Ngaysinh = ngaysinh;
	Sodienthoai = sodienthoai;
	Email = email;
}

public String getMakhachhang() {
	return Makhachhang;
}
public void setMakhachhang(String makhachhang) {
	this.Makhachhang = makhachhang;
}
public String getTendangnhap() {
	return Tendangnhap;
}
public void setTendangnhap(String tendangnhap) {
	this.Tendangnhap = tendangnhap;
}
public String getMatkhau() {
	return Matkhau;
}
public void setMatkhau(String matkhau) {
	this.Matkhau = matkhau;
}
public String getHovaten() {
	return Hovaten;
}
public void setHovaten(String hovaten) {
	this.Hovaten = hovaten;
}
public String getGioitinh() {
	return Gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.Gioitinh = gioitinh;
}
public String getDiachi() {
	return Diachi;
}
public void setDiachi(String diachi) {
	this.Diachi = diachi;
}
public String getDiachinhanhang() {
	return Diachinhanhang;
}
public void setDiachinhanhang(String diachinhanhang) {
	this.Diachinhanhang = diachinhanhang;
}
public String getDiachimuahang() {
	return Diachimuahang;
}
public void setDiachimuahang(String diachimuahang) {
	this.Diachimuahang = diachimuahang;
}
public Date getNgaysinh() {
	return Ngaysinh;
}
public void setNgaysinh(Date ngaysinh) {
	this.Ngaysinh = ngaysinh;
}
public String getSodienthoai() {
	return Sodienthoai;
}
public void setSodienthoai(String sodienthoai) {
	this.Sodienthoai = sodienthoai;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	this.Email = email;
}


 
}
