package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.Xe;

@Repository
public class XeDao {
	@PersistenceContext
    private EntityManager entity;
	
	 public List<Xe> findallXe(){
    	 return entity.createQuery("FROM Xe", Xe.class).getResultList();
     }
	 
	 public Xe findByIdXe(String id) {
    	 return entity.find(Xe.class, id);
     }
	 
	 public void saveXe(Xe xe) {
    	 entity.persist(xe);
     }
}
