package faca.training.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.TinhThanh;
import faca.training.dao.TinhThanhDao;

@Service
@Transactional
public class TinhThanhServices {

	@Autowired
	private TinhThanhDao tinhthanhdao;
	
	public List<TinhThanh> findallTinhThanh(){
		return tinhthanhdao.findallTinhThanh();
	}
}
