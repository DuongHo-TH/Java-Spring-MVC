package faca.training.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class DangKy {
	@Id
	private String madk;
	@NotBlank(message = "Tên Khách Hàng không được để trống")
	private String hoten;
	@ManyToOne
	@JoinColumn(name = "matt", referencedColumnName = "matt")
	private TinhThanh matt;
	@Pattern(regexp = "(\\+84|0)[0-9]{9,10}", message = "Số Điện Thoại Không Đúng Định Dạng")
	private String sdt;
	private int soluongdv;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Ngày Đăng Ký không được để trống")
	private LocalDate ngaydk;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Ngày Sử Dụng không được để trống")
	private LocalDate ngaysddv;
	private double tonhtien;

	public String getMadk() {
		return madk;
	}

	public void setMadk(String madk) {
		this.madk = madk;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public TinhThanh getMatt() {
		return matt;
	}

	public void setMatt(TinhThanh matt) {
		this.matt = matt;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getSoluongdv() {
		return soluongdv;
	}

	public void setSoluongdv(int soluongdv) {
		this.soluongdv = soluongdv;
	}

	public LocalDate getNgaydk() {
		return ngaydk;
	}

	public void setNgaydk(LocalDate ngaydk) {
		this.ngaydk = ngaydk;
	}

	public LocalDate getNgaysddv() {
		return ngaysddv;
	}

	public void setNgaysddv(LocalDate ngaysddv) {
		this.ngaysddv = ngaysddv;
	}

	public double getTonhtien() {
		return tonhtien;
	}

	public void setTonhtien(double tonhtien) {
		this.tonhtien = tonhtien;
	}

	public DangKy(String madk, String hoten, TinhThanh matt, String sdt, int soluongdv, LocalDate ngaydk,
			LocalDate ngaysddv, double tonhtien) {
		super();
		this.madk = madk;
		this.hoten = hoten;
		this.matt = matt;
		this.sdt = sdt;
		this.soluongdv = soluongdv;
		this.ngaydk = ngaydk;
		this.ngaysddv = ngaysddv;
		this.tonhtien = tonhtien;
	}

	public DangKy() {
		super();
	}

}
