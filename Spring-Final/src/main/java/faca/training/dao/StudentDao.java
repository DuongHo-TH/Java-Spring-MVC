package faca.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import faca.training.bean.Student;

public interface StudentDao extends JpaRepository<Student, String> {

}
