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

	public List<LichTrinhXe> findaddlichtrinh() {
		return reponsitory.finallLichTrinh();
	}
    public void savelichtrinh(LichTrinhXe lichtrinh) {
    	reponsitory.saveLichTrinh(lichtrinh);
    }
}
