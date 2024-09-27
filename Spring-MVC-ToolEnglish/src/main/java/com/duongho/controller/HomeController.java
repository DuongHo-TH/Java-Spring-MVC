package com.duongho.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duongho.entities.NewWord;
import com.duongho.service.WordService;

@Controller
public class HomeController {
 @Autowired
 private WordService service;
 
  @GetMapping("/")
  public String showhome(Model model, HttpSession session){
	  model.addAttribute("word", service.findword());
	  return "/Home";
  }
  @PostMapping("saveword")
  public String saveword(Model model, @ModelAttribute("word")  NewWord word) {
	  service.saveword(word);
	  return "redirect:/";
  }
  @GetMapping("/createword")
  public String createword() {
	  return "CreateNewWord";
  }
  @GetMapping("/search")
  public String kiemtratu(Model model, @RequestParam("search") String search, @RequestParam("newid") String newid) {
	  int id = Integer.parseInt(newid);
	  NewWord word = service.findwordById(id);
	  if(search.equalsIgnoreCase(word.getVietnamese())) {
		  model.addAttribute("word", service.findword());
		  return "/Home";
	  }else {
		  model.addAttribute("word", word);
		  return "/Home";
	  }
  }
}
