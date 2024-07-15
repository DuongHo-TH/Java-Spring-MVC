package faca.training.servie;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.LichTrinhXe;
import faca.training.dao.LichTrinhXeDao;

@Service
@Transactional
public class LichTrinhXeService {
@Autowired
private LichTrinhXeDao reponsitory;

 public void saveLichTrinh(LichTrinhXe lichtrinh) {
	 
	 reponsitory.save(lichtrinh);
 }
 public List<LichTrinhXe> findallLichtrinh(){
	 return reponsitory.findAll();
 }
}
