package faca.training.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import faca.training.bean.Xe;
import faca.training.servie.XeServices;

@Controller
public class XeController {

	@Autowired
    private XeServices xeservice;
	
	@PostMapping("/savexe")
	public String savexe(Model model, @ModelAttribute("xemoi") @Valid Xe xe, BindingResult result) {
		if(result.hasErrors()) {
			return "/ThemXe";
		}
		xeservice.saveXe(xe);
		return "/Home";
	}
	
	@GetMapping("/searchlichtrinh")
	public String searchlichtrinh(Model model, @RequestParam("search") String search) {
		List<Object[]> listxe = xeservice.searchlichtrinh(search);
		
		model.addAttribute("listlichtrinh", listxe);
		return "/lichtrinhtuyen";
	}
	
	@GetMapping("/tongtienxe")
	public String showtongtien(Model model) {
		List<Object[]> listtienxe = xeservice.showtongtien();
		model.addAttribute("listtongtien", listtienxe);
		return "/tienxe";
	}
	
}
