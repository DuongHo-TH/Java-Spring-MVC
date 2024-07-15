package faca.training.servie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.TuyenXe;
import faca.training.dao.TuyenXeDao;
@Service
@Transactional
public class TuyenXeService {
 @Autowired
 private TuyenXeDao reponsitory;
  public List<TuyenXe> findallTuyenXe(){
	  return reponsitory.findallTuyenXe();
  }
  
  public TuyenXe findByIdTuyenXe(String id) {
	  return reponsitory.findByIdTuyenXe(id);
  }
  
  
}
