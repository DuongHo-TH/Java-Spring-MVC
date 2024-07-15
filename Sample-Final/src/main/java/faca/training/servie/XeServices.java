package faca.training.servie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.Xe;
import faca.training.dao.XeDao;

@Service
@Transactional
public class XeServices {
	@Autowired
	private XeDao reponsitory;
	
	public List<Xe> findallXe(){
		return reponsitory.findallXe();
	}
	
	public void saveXe(Xe xe) {
		reponsitory.saveXe(xe);
	}
	public Xe findByIdXe(String id) {
		  return reponsitory.findByIdXe(id);
	  }

}
