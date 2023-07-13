package model;

public class chitietdonhang {
	private String machitietdonhang;
	private donhang dhang;
	private sanpham spham;
	private double soluong;
	private double giagoc;
	private double giamgia;
	private double giaban;
	private double thuevat;
	private double tongtien;
	public chitietdonhang() {
	
	}
	public chitietdonhang(String machitietdonhang, donhang dhang, sanpham spham, double soluong, double giagoc,
			double giamgia, double giaban, double thuevat, double tongtien) {
		super();
		this.machitietdonhang = machitietdonhang;
		this.dhang = dhang;
		this.spham = spham;
		this.soluong = soluong;
		this.giagoc = giagoc;
		this.giamgia = giamgia;
		this.giaban = giaban;
		this.thuevat = thuevat;
		this.tongtien = tongtien;
	}
	public String getMachitietdonhang() {
		return machitietdonhang;
	}
	public void setMachitietdonhang(String machitietdonhang) {
		this.machitietdonhang = machitietdonhang;
	}
	public donhang getDhang() {
		return dhang;
	}
	public void setDhang(donhang dhang) {
		this.dhang = dhang;
	}
	public sanpham getSpham() {
		return spham;
	}
	public void setSpham(sanpham spham) {
		this.spham = spham;
	}
	public double getSoluong() {
		return soluong;
	}
	public void setSoluong(double soluong) {
		this.soluong = soluong;
	}
	public double getGiagoc() {
		return giagoc;
	}
	public void setGiagoc(double giagoc) {
		this.giagoc = giagoc;
	}
	public double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	public double getThuevat() {
		return thuevat;
	}
	public void setThuevat(double thuevat) {
		this.thuevat = thuevat;
	}
	public double getTongtien() {
		return tongtien;
	}
	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}
	
	
	
}
