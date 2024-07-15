package faca.training.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String id;
	@Column
	private String Studentname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public Student() {
		super();
	}

	public Student(String id, String studentname) {
		super();
		this.id = id;
		Studentname = studentname;
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getStudentname()=" + getStudentname() + "]";
	}


}
