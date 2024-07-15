package faca.training.servie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.NhaXe;
import faca.training.dao.NhaXeDao;

@Service
@Transactional
public class NhaXeService {

	@Autowired
	private NhaXeDao repository;
	
	public List<NhaXe> findallnhaxe(){
		return repository.findAll();
	}
}
