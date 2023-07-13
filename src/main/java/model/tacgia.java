package model;

import java.sql.Date;

public class tacgia {
	private String matacgia;
	private String hovaten;
	private Date namsinh;
	private String tieusu;
	
	
	public tacgia() {
	
	}
	public tacgia(String matacgia, String hovaten, Date namsinh, String tieusu) {
	
		this.matacgia = matacgia;
		this.hovaten = hovaten;
		this.namsinh = namsinh;
		this.tieusu = tieusu;
	}
	public String getMatacgia() {
		return matacgia;
	}
	public void setMatacgia(String matacgia) {
		this.matacgia = matacgia;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public Date getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(Date namsinh) {
		this.namsinh = namsinh;
	}
	public String getTieusu() {
		return tieusu;
	}
	public void setTieusu(String tieusu) {
		this.tieusu = tieusu;
	}
	
}
