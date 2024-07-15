package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.LichTrinhXe;
import faca.training.bean.Xe;

@Repository
public class LichTrinhXeDao {
	 @PersistenceContext
     private EntityManager entity;
	 
	 
	 public List<LichTrinhXe> finallLichTrinh(){
    	 return entity.createQuery("FROM LichTrinhXe", LichTrinhXe.class).getResultList();
     }
	 
	 public void saveLichTrinh(LichTrinhXe lichtrinh) {
		 Xe xe = entity.find(Xe.class, lichtrinh.getIdlichtrinh().getMaxe());
		 lichtrinh.setXe(xe);
    	 entity.persist(lichtrinh);
     }
}
