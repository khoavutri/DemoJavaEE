package model;

public class theloai {
	private String tentheloai;
	private String matheloai;
	public theloai() {
		
	}
	public theloai(String tentheloai, String matheloai) {
	
		this.tentheloai = tentheloai;
		this.matheloai = matheloai;
	}
	public String getTentheloai() {
		return tentheloai;
	}
	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}
	public String getMatheloai() {
		return matheloai;
	}
	public void setMatheloai(String matheloai) {
		this.matheloai = matheloai;
	}
	
}
