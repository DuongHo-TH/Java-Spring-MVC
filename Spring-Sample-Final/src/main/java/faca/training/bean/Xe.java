package faca.training.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Xe {
	@Id
	private String maxe;
	private String hangsanxuat;
	@ManyToOne
	@JoinColumn(name = "maloaixe")
	private LoaiXe loaixe;
	@Pattern(regexp = "^[0-9]{2}[A-Z][0-9]-[0-9]{5}$", message = "Biển Số Phải �?úng �?ịnh Dạng xxYx-xxxxx")
	private String bienso;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hankiemdinh;
	@ManyToOne
	@JoinColumn(name = "manhaxe")
	private NhaXe nhaxe;
	@OneToMany(mappedBy = "xe")
	private List<LichTrinhXe> lichtrinhxe;
	

	public List<LichTrinhXe> getLichtrinhxe() {
		return lichtrinhxe;
	}

	public void setLichtrinhxe(List<LichTrinhXe> lichtrinhxe) {
		this.lichtrinhxe = lichtrinhxe;
	}

	public String getMaxe() {
		return maxe;
	}

	public void setMaxe(String maxe) {
		this.maxe = maxe;
	}

	public String getHangsanxuat() {
		return hangsanxuat;
	}

	public void setHangsanxuat(String hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}

	public LoaiXe getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(LoaiXe loaixe) {
		this.loaixe = loaixe;
	}

	public String getBienso() {
		return bienso;
	}

	public void setBienso(String bienso) {
		this.bienso = bienso;
	}

	public LocalDate getHankiemdinh() {
		return hankiemdinh;
	}

	public void setHankiemdinh(LocalDate hankiemdinh) {
		this.hankiemdinh = hankiemdinh;
	}

	public NhaXe getNhaxe() {
		return nhaxe;
	}

	public void setNhaxe(NhaXe nhaxe) {
		this.nhaxe = nhaxe;
	}

	public Xe(String maxe, String hangsanxuat, LoaiXe loaixe, String bienso, LocalDate hankiemdinh, NhaXe nhaxe) {
		super();
		this.maxe = maxe;
		this.hangsanxuat = hangsanxuat;
		this.loaixe = loaixe;
		this.bienso = bienso;
		this.hankiemdinh = hankiemdinh;
		this.nhaxe = nhaxe;
	}

	public Xe() {
		super();
	}

	@Override
	public String toString() {
		return "Xe [getMaxe()=" + getMaxe() + ", getHangsanxuat()=" + getHangsanxuat() + ", getBienso()=" + getBienso()
				+ ", getHankiemdinh()=" + getHankiemdinh() + "]";
	}

}
