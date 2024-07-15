package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
		  Xe xe = entity.find(Xe.class, lichtrinh.getId().getMaxe());
		  lichtrinh.setXe(xe);
    	 entity.persist(lichtrinh);
     }
	 
	 public List<LichTrinhXe> searchLichTrinh(String search){
		 String hql = "FROM LichTrinhXe lt  WHERE lt.xe.nhaxe.tennhaxe Like :tennhaxe";
		 TypedQuery<LichTrinhXe> query = entity.createQuery(hql, LichTrinhXe.class);
		 query.setParameter("tennhaxe", "%"+search+"%");
		 return query.getResultList();
	 }
}
