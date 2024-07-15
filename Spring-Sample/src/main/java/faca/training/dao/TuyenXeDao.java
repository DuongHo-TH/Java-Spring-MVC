package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.TuyenXe;

@Repository
public class TuyenXeDao {

	@PersistenceContext
    private EntityManager entity;
	
	 public List<TuyenXe> findallTuyenXe(){
    	 return entity.createQuery("FROM TuyenXe", TuyenXe.class).getResultList();
     }

   
     public TuyenXe findByIdTuyenXe(String id) {
    	 return entity.find(TuyenXe.class, id);
     }
}
