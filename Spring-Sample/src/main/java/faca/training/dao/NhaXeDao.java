package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.NhaXe;

@Repository
public class NhaXeDao {
	  @PersistenceContext
	     private EntityManager entity;
	  
	  public List<NhaXe> findallNhaXe(){
	    	 return entity.createQuery("FROM NhaXe", NhaXe.class).getResultList();
	     }

}
