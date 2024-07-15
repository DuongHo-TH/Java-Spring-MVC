package faca.training.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.Student;
import faca.training.dao.StudentDao;
@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentDao studentdao;
	
	public void saveStudent(Student student) {
		studentdao.save(student);
	}

}
