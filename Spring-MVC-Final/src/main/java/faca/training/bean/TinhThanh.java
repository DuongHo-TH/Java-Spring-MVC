package faca.training.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TinhThanh {
	@Id
 private String matt;
 private String tentt;
public String getMatt() {
	return matt;
}
public void setMatt(String matt) {
	this.matt = matt;
}
public String getTentt() {
	return tentt;
}
public void setTentt(String tentt) {
	this.tentt = tentt;
}
public TinhThanh(String matt, String tentt) {
	super();
	this.matt = matt;
	this.tentt = tentt;
}
public TinhThanh() {
	super();
}
 
 
}
