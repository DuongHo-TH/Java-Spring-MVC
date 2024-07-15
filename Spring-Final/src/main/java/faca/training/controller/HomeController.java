package faca.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import faca.training.bean.Student;
import faca.training.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	StudentService service;

	@RequestMapping("/")
	public String Student() {
		return "Home";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "Home";
	}
}
