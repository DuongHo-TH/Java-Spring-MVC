package com.duongho.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duongho.dao.WordDao;
import com.duongho.entities.NewWord;

@Service
@Transactional
public class WordService {
	
	@Autowired
	private WordDao dao;
	
	public void saveword(NewWord word) {
		dao.save(word);
	}
	
	public List<NewWord> findword(){
		return dao.findword();
	}
	
	public NewWord findwordById(int id) {
		return dao.findwordById(id);
	}

}
