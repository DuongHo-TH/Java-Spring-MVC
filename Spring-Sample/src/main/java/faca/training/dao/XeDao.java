package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	 
	 @SuppressWarnings("unchecked")
	public List<Object[]> showlichtrinh(){
		 String hql = "SELECT x.maxe, x.bienso, nx.tennhaxe, tx.matuyen, tx.tuyenduong, lt.tentaixe, lt.id.ngayxuatben, lt.id.gioxuatben "
		 		+ "FROM Xe x LEFT JOIN LichTrinhXe lt on x.maxe = lt.id.maxe LEFT JOIN TuyenXe tx  on lt.tuyenxe = tx.matuyen LEFT JOIN NhaXe nx on x.nhaxe = nx.manhaxe ";
		 
		Query query = entity.createQuery(hql);
		
		return  query.getResultList();
	 }
	 
	 @SuppressWarnings("unchecked")
	public List<Object[]> searchlichtrinh(String search){
		 String hql = "SELECT x.maxe, x.bienso, nx.tennhaxe, tx.matuyen, tx.tuyenduong, lt.tentaixe, lt.id.ngayxuatben, lt.id.gioxuatben "
		 		+ "FROM Xe x LEFT JOIN LichTrinhXe lt on x.maxe = lt.id.maxe LEFT JOIN TuyenXe tx  on lt.tuyenxe = tx.matuyen LEFT JOIN NhaXe nx on x.nhaxe = nx.manhaxe "
		 		+ "WHERE nx.tennhaxe LIKE :nhaxe";
		 
		Query query = entity.createQuery(hql);
		query.setParameter("nhaxe", "%"+search+"%");
		
		return  query.getResultList();
	 }
	
	public List<Object[]> showtongtien(){
		 String hql = "SELECT SUM(lt.soluonghanhkhach * tx.dongia), nx.manhaxe, nx.tennhaxe "
		 		+ "FROM Xe x JOIN LichTrinhXe lt on x.maxe = lt.id.maxe JOIN TuyenXe tx  on lt.tuyenxe = tx.matuyen JOIN NhaXe nx on x.nhaxe = nx.manhaxe "
		 		+ "GROUP BY nx.manhaxe, nx.tennhaxe";
		 
		Query query = entity.createQuery(hql);
		
		return  query.getResultList();
	 }
}

