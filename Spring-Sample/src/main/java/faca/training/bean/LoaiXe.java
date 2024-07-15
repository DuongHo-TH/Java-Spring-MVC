package faca.training.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiXe {
	@Id
	private String maloaixe;
	private String motaloaixe;
	private int sochongoi;
	@OneToMany(mappedBy = "loaixe", fetch = FetchType.LAZY)
	private List<Xe> listxe;

	public String getMaloaixe() {
		return maloaixe;
	}

	public void setMaloaixe(String maloaixe) {
		this.maloaixe = maloaixe;
	}

	public String getMotaloaixe() {
		return motaloaixe;
	}

	public void setMotaloaixe(String motaloaixe) {
		this.motaloaixe = motaloaixe;
	}

	public int getSochongoi() {
		return sochongoi;
	}

	public void setSochongoi(int sochongoi) {
		this.sochongoi = sochongoi;
	}

	public List<Xe> getListxe() {
		return listxe;
	}

	public void setListxe(List<Xe> listxe) {
		this.listxe = listxe;
	}

	public LoaiXe(String maloaixe, String motaloaixe, int sochongoi, List<Xe> listxe) {
		super();
		this.maloaixe = maloaixe;
		this.motaloaixe = motaloaixe;
		this.sochongoi = sochongoi;
		this.listxe = listxe;
	}

	public LoaiXe() {
		super();
	}

	@Override
	public String toString() {
		return "LoaiXe [getMaloaixe()=" + getMaloaixe() + ", getMotaloaixe()=" + getMotaloaixe() + ", getSochongoi()="
				+ getSochongoi() + "]";
	}

}
