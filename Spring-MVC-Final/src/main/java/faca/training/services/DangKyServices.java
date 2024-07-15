package faca.training.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.DangKy;
import faca.training.dao.DangKyDao;

@Service
@Transactional
public class DangKyServices {

	@Autowired
	private DangKyDao dao;
	
	
	public void saveDangky(DangKy dk) {
		double tongtien = (dk.getSoluongdv() * 300000);
		if(dk.getSoluongdv() > 3) {
		tongtien = (dk.getSoluongdv() * 300000) * 0.9;
		}
		if(dk.getMatt().getMatt().equalsIgnoreCase("TT002")) {
			tongtien = tongtien * 0.95;
		}
		dk.setTonhtien(tongtien);
		dao.saveDangky(dk);
	}
	
	public void updateDangky(DangKy dk) {
		double tongtien = (dk.getSoluongdv() * 300000);
		if(dk.getSoluongdv() > 3) {
		tongtien = (dk.getSoluongdv() * 300000) * 0.9;
		}
		if(dk.getMatt().getMatt().equalsIgnoreCase("TT002")) {
			tongtien = tongtien * 0.95;
		}
		dk.setTonhtien(tongtien);
		dao.updateDangky(dk);
	}
	
	public List<DangKy> findallDangKy(int page){
		return dao.findallDangKy(page);
	}
	
	public int findtotal() {
		return dao.findtotal();
	}
	
	public List<DangKy> searchDK(String search){
		return dao.searchDK(search);
	}
	
	public DangKy findById(String id) {
		return dao.findById(id);
	}
}
