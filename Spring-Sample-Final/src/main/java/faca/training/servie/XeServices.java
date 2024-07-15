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
	private XeDao xedao;

    public List<Xe> findallXe(){
    	return xedao.findAll();
    }
    public Xe findByIdXe(String id) {
    	return xedao.findById(id).orElse(null);
    }

	public void savexe(Xe xe) {
		xedao.save(xe);
	}
}
