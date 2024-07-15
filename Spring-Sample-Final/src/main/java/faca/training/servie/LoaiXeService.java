package faca.training.servie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.LoaiXe;
import faca.training.dao.LoaiXeDao;

@Service
@Transactional
public class LoaiXeService {

	@Autowired
	private LoaiXeDao repository;
	
	public List<LoaiXe> findallloaixe() {
		return repository.findAll();
	}
}
