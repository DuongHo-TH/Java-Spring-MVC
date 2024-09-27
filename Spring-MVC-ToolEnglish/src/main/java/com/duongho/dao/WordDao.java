package com.duongho.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.duongho.entities.NewWord;


@Repository
public class WordDao {
	@PersistenceContext
	private EntityManager entity;
	
	
	public void save(NewWord word) {
		entity.persist(word);
	}
	
	public NewWord findwordById(int id) {
		return entity.find(NewWord.class, id);
	}
	
	public List<NewWord> findword() {
		String sql = "FROM NewWord ORDER BY NEWID()";
		TypedQuery<NewWord> query = entity.createQuery(sql, NewWord.class);
		return query.setMaxResults(1).getResultList();
	}
}
