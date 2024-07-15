package faca.training.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class NhaXe {
	@Id
	private String manhaxe;
	private String tennhaxe;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate namthanhlap;
	@OneToMany(mappedBy = "nhaxe", cascade = CascadeType.REMOVE)
	private List<Xe> listtxe;

	public String getManhaxe() {
		return manhaxe;
	}

	public void setManhaxe(String manhaxe) {
		this.manhaxe = manhaxe;
	}

	public String getTennhaxe() {
		return tennhaxe;
	}

	public void setTennhaxe(String tennhaxe) {
		this.tennhaxe = tennhaxe;
	}

	public LocalDate getNamthanhlap() {
		return namthanhlap;
	}

	public void setNamthanhlap(LocalDate namthanhlap) {
		this.namthanhlap = namthanhlap;
	}

	public List<Xe> getListtxe() {
		return listtxe;
	}

	public void setListtxe(List<Xe> listtxe) {
		this.listtxe = listtxe;
	}

	public NhaXe(String manhaxe, String tennhaxe, LocalDate namthanhlap) {
		super();
		this.manhaxe = manhaxe;
		this.tennhaxe = tennhaxe;
		this.namthanhlap = namthanhlap;
	}

	public NhaXe() {
		super();
	}

	@Override
	public String toString() {
		return "NhaXe [getManhaxe()=" + getManhaxe() + ", getTennhaxe()=" + getTennhaxe() + ", getNamthanhlap()="
				+ getNamthanhlap() + "]";
	}

}
