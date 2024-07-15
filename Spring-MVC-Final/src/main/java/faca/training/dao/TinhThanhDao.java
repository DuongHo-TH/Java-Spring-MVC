package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import faca.training.bean.TinhThanh;
@Repository
public class TinhThanhDao {
	@PersistenceContext
	private EntityManager entity;
	
	public List<TinhThanh> findallTinhThanh(){
		return entity.createQuery("FROM TinhThanh", TinhThanh.class).getResultList();
	}
}
