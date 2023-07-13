package model;

public class anh {
	private String link;
	private String idsanpham;
	private String tensp;
	private String mota;
	public anh(String link, String idsanpham, String tensp, String mota) {
		this.link = link;
		this.idsanpham = idsanpham;
		this.tensp = tensp;
		this.mota = mota;
	}
	
	public anh() {}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIdsanpham() {
		return idsanpham;
	}

	public void setIdsanpham(String idsanpham) {
		this.idsanpham = idsanpham;
	}

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
	
	
	
}
