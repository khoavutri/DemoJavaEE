package model;

public class donhang {
	private String madonhang;
	private khachhang khang;
	private String diachimuahang;
	private String diachinhanhang;
	private String trangthai;
	private String hinhthucthanhtoan;
	private String trangthaithanhtoan;
	private long sotiendathanhtoan;
	private long sotienconthieu;
	private int ngaydathang;
	private int ngaygiaohang;
	public donhang() {
		
	}
	public donhang(String madonhang, khachhang khang, String diachimuahang, String diachinhanhang, String trangthai,
			String hinhthucthanhtoan, String trangthaithanhtoan, long sotiendathanhtoan, long sotienconthieu,
			int ngaydathang, int ngaygiaohang) {
		super();
		this.madonhang = madonhang;
		this.khang = khang;
		this.diachimuahang = diachimuahang;
		this.diachinhanhang = diachinhanhang;
		this.trangthai = trangthai;
		this.hinhthucthanhtoan = hinhthucthanhtoan;
		this.trangthaithanhtoan = trangthaithanhtoan;
		this.sotiendathanhtoan = sotiendathanhtoan;
		this.sotienconthieu = sotienconthieu;
		this.ngaydathang = ngaydathang;
		this.ngaygiaohang = ngaygiaohang;
	}
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public khachhang getKhang() {
		return khang;
	}
	public void setKhang(khachhang khang) {
		this.khang = khang;
	}
	public String getDiachimuahang() {
		return diachimuahang;
	}
	public void setDiachimuahang(String diachimuahang) {
		this.diachimuahang = diachimuahang;
	}
	public String getDiachinhanhang() {
		return diachinhanhang;
	}
	public void setDiachinhanhang(String diachinhanhang) {
		this.diachinhanhang = diachinhanhang;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getHinhthucthanhtoan() {
		return hinhthucthanhtoan;
	}
	public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
		this.hinhthucthanhtoan = hinhthucthanhtoan;
	}
	public String getTrangthaithanhtoan() {
		return trangthaithanhtoan;
	}
	public void setTrangthaithanhtoan(String trangthaithanhtoan) {
		this.trangthaithanhtoan = trangthaithanhtoan;
	}
	public long getSotiendathanhtoan() {
		return sotiendathanhtoan;
	}
	public void setSotiendathanhtoan(long sotiendathanhtoan) {
		this.sotiendathanhtoan = sotiendathanhtoan;
	}
	public long getSotienconthieu() {
		return sotienconthieu;
	}
	public void setSotienconthieu(long sotienconthieu) {
		this.sotienconthieu = sotienconthieu;
	}
	public int getNgaydathang() {
		return ngaydathang;
	}
	public void setNgaydathang(int ngaydathang) {
		this.ngaydathang = ngaydathang;
	}
	public int getNgaygiaohang() {
		return ngaygiaohang;
	}
	public void setNgaygiaohang(int ngaygiaohang) {
		this.ngaygiaohang = ngaygiaohang;
	}
	
}
