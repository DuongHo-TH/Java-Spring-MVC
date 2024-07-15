package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import faca.training.bean.DangKy;

@Repository
public class DangKyDao {
	@PersistenceContext
	private EntityManager entity;
	
	
	public void saveDangky(DangKy dk) {
		entity.persist(dk);
	}
	
	public void updateDangky(DangKy dk) {
		entity.merge(dk);
	}
	
	public List<DangKy> findallDangKy(int page){
		int fristresult = (page - 1) * 10;
		return entity.createQuery("FROM DangKy", DangKy.class).setFirstResult(fristresult).setMaxResults(10)
				.getResultList();
	}
	public DangKy findById(String id) {
		return entity.find(DangKy.class, id);
	}
	

	public int findtotal() {

		return entity.createQuery("FROM DangKy", DangKy.class).getResultList().size() + 9;
	}
	
	public List<DangKy> searchDK(String search){
		String hql = "FROM DangKy WHERE hoten Like : hoten or matt.tentt like : tentt";
		 TypedQuery<DangKy> query = entity.createQuery(hql, DangKy.class);
		 query.setParameter("hoten", "%"+search+"%");
		 query.setParameter("tentt", "%" + search + "%");
		return query.setMaxResults(10).getResultList();
		}
}
