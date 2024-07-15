package faca.training.bean;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.validation.Valid;

@Entity
public class LichTrinhXe {
	@Valid
	@EmbeddedId
	private LichTrinhXeId idlichtrinh;
	private String tentaixe;
	@MapsId("maxe")
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "maxe", referencedColumnName = "maxe")
	private Xe xe;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matuyen", referencedColumnName = "matuyen")
	private TuyenXe tuyenxe;
	private int soluonghanhkhach;

	public LichTrinhXeId getIdlichtrinh() {
		return idlichtrinh;
	}

	public void setIdlichtrinh(LichTrinhXeId idlichtrinh) {
		this.idlichtrinh = idlichtrinh;
	}

	public String getTentaixe() {
		return tentaixe;
	}

	public void setTentaixe(String tentaixe) {
		this.tentaixe = tentaixe;
	}

	public Xe getXe() {
		return xe;
	}

	public void setXe(Xe xe) {
		this.xe = xe;
	}

	public TuyenXe getTuyenxe() {
		return tuyenxe;
	}

	public void setTuyenxe(TuyenXe tuyenxe) {
		this.tuyenxe = tuyenxe;
	}

	public int getSoluonghanhkhach() {
		return soluonghanhkhach;
	}

	public void setSoluonghanhkhach(int soluonghanhkhach) {
		this.soluonghanhkhach = soluonghanhkhach;
	}

	public LichTrinhXe(LichTrinhXeId idlichtrinh, String tentaixe, Xe xe, TuyenXe tuyenxe, int soluonghanhkhach) {
		super();
		this.idlichtrinh = idlichtrinh;
		this.tentaixe = tentaixe;
		this.xe = xe;
		this.tuyenxe = tuyenxe;
		this.soluonghanhkhach = soluonghanhkhach;
	}

	public LichTrinhXe() {
		super();
	}

	@Override
	public String toString() {
		return "LichTrinhXe [getIdlichtrinh()=" + getIdlichtrinh() + ", getTentaixe()=" + getTentaixe()
				+ ", getSoluonghanhkhach()=" + getSoluonghanhkhach() + "]";
	}

}
