package faca.training.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TuyenXe {
     @Id
	private String matuyen;
	private String tuyenduong;
	private double dongia;
	@OneToMany(mappedBy = "tuyenxe", cascade = CascadeType.REMOVE)
	private List<LichTrinhXe> listlichtrinh;
	public String getMatuyen() {
		return matuyen;
	}
	public void setMatuyen(String matuyen) {
		this.matuyen = matuyen;
	}
	public String getTuyenduong() {
		return tuyenduong;
	}
	public void setTuyenduong(String tuyenduong) {
		this.tuyenduong = tuyenduong;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public List<LichTrinhXe> getListlichtrinh() {
		return listlichtrinh;
	}
	public void setListlichtrinh(List<LichTrinhXe> listlichtrinh) {
		this.listlichtrinh = listlichtrinh;
	}
	public TuyenXe() {
		super();
	}
	public TuyenXe(String matuyen, String tuyenduong, double dongia) {
		super();
		this.matuyen = matuyen;
		this.tuyenduong = tuyenduong;
		this.dongia = dongia;
		
	}
	@Override
	public String toString() {
		return "TuyenXe [getMatuyen()=" + getMatuyen() + ", getTuyenduong()=" + getTuyenduong() + ", getDongia()="
				+ getDongia() + "]";
	}
	
}
