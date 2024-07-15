package faca.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import faca.training.bean.LichTrinhXe;
import faca.training.bean.LichTrinhXeId;
@Repository
public interface LichTrinhXeDao extends JpaRepository<LichTrinhXe, LichTrinhXeId> {
	

}
