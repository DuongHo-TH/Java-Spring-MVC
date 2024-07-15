package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.LoaiXe;

@Repository
public class LoaiXeDao {

	@PersistenceContext
    private EntityManager entity;
	
	 public List<LoaiXe> findallLoaiXe(){
    	 return entity.createQuery("FROM LoaiXe", LoaiXe.class).getResultList();
     }
}
