package model;

public class sanpham {
	private String masanpham;
	private String tensanpham;
	private tacgia tgia;
	private int namxuatban;
	private int gianhap;
	private int giagoc;
	private int giaban;
	private long soluong;
	private theloai tloai;
	private String ngonngu;
	private String mota;
	public sanpham() {
		
	}
	public sanpham(String masanpham, String tensanpham, tacgia tgia, int namxuatban, int gianhap, int giagoc,
			int giaban, long soluong, theloai tloai, String ngonngu, String mota) {
		super();
		this.masanpham = masanpham;
		this.tensanpham = tensanpham;
		this.tgia = tgia;
		this.namxuatban = namxuatban;
		this.gianhap = gianhap;
		this.giagoc = giagoc;
		this.giaban = giaban;
		this.soluong = soluong;
		this.tloai = tloai;
		this.ngonngu = ngonngu;
		this.mota = mota;
	}
	public String getMasanpham() {
		return masanpham;
	}
	public void setMasanpham(String masanpham) {
		this.masanpham = masanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public tacgia getTgia() {
		return tgia;
	}
	public void setTgia(tacgia tgia) {
		this.tgia = tgia;
	}
	public int getNamxuatban() {
		return namxuatban;
	}
	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}
	public int getGianhap() {
		return gianhap;
	}
	public void setGianhap(int gianhap) {
		this.gianhap = gianhap;
	}
	public int getGiagoc() {
		return giagoc;
	}
	public void setGiagoc(int giagoc) {
		this.giagoc = giagoc;
	}
	public int getGiaban() {
		return giaban;
	}
	public void setGiaban(int giaban) {
		this.giaban = giaban;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public theloai getTloai() {
		return tloai;
	}
	public void setTloai(theloai tloai) {
		this.tloai = tloai;
	}
	public String getNgonngu() {
		return ngonngu;
	}
	public void setNgonngu(String ngonngu) {
		this.ngonngu = ngonngu;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}
