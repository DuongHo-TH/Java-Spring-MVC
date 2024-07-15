package faca.training.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class LichTrinhXeId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "maXe khong duoc null")
	private String maxe;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "ngayXuatBen khong duoc null")
	private LocalDate ngayxuatben;
	@DateTimeFormat(pattern = "HH:mm")
	@NotNull(message = "ngayXuatBen khong duoc null")
	private LocalTime gioxuatben;

	public String getMaxe() {
		return maxe;
	}

	public void setMaxe(String maxe) {
		this.maxe = maxe;
	}


	public LocalTime getGioxuatben() {
		return gioxuatben;
	}

	public void setGioxuatben(LocalTime gioxuatben) {
		this.gioxuatben = gioxuatben;
	}

	public LocalDate getNgayxuatben() {
		return ngayxuatben;
	}

	public void setNgayxuatben(LocalDate ngayxuatben) {
		this.ngayxuatben = ngayxuatben;
	}

	public LichTrinhXeId() {
		super();
	}

	public LichTrinhXeId(String maxe, LocalDate ngayxuatben, LocalTime gioxuatben) {
		super();
		this.maxe = maxe;
		this.ngayxuatben = ngayxuatben;
		this.gioxuatben = gioxuatben;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gioxuatben, maxe, ngayxuatben);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LichTrinhXeId other = (LichTrinhXeId) obj;
		return Objects.equals(gioxuatben, other.gioxuatben) && Objects.equals(maxe, other.maxe)
				&& Objects.equals(ngayxuatben, other.ngayxuatben);
	}

	
}
