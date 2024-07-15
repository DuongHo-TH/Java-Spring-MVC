package faca.training.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import faca.training.bean.DangKy;
import faca.training.services.DangKyServices;
import faca.training.services.TinhThanhServices;

@Controller
public class HomeController {
     @Autowired
     private DangKyServices dkservices;
     @Autowired
     private TinhThanhServices ttservices;
	
     @GetMapping(value = {"/","/trang-chu"})
 	public String showDangKy(Model model, @RequestParam(value = "page", defaultValue = "1") int page) {
 		model.addAttribute("page", page);
 		model.addAttribute("totaldanhsach", dkservices.findtotal() / 10);
 		model.addAttribute("listdk", dkservices.findallDangKy(page));
 		
 		return "/Home";
 	}
     @GetMapping("/searchdk")
     public String searchDK(Model model, @RequestParam("search") String search) {
 		model.addAttribute("page", 1);
 	    model.addAttribute("listdk", dkservices.searchDK(search));
 	    return "/Home";
 	}
	@GetMapping("/dangky")
	public String dangky(Model model) {
		model.addAttribute("tinhthanhlist", ttservices.findallTinhThanh());
		model.addAttribute("dk", new DangKy());
		return "/DangKyTT";
	}
	
	@PostMapping("/savedangky")
	public String savedangky(Model model, @ModelAttribute("dk") @Valid DangKy dangky, BindingResult result) {
		System.out.println(dangky);
		if(result.hasErrors()) {
			model.addAttribute("tinhthanhlist", ttservices.findallTinhThanh());
			return "/DangKyTT";
		}
		dkservices.saveDangky(dangky);
		return "redirect:/trang-chu";
	}
	
	@GetMapping("/editdk")
	public String editmay(Model model, @RequestParam("dkId") String id) {
		model.addAttribute("tinhthanhlist", ttservices.findallTinhThanh());
		DangKy dk = dkservices.findById(id);
		model.addAttribute("dk", dk);
		return"/UpdateDangKy";
	}
	@PostMapping("/updatedk")
	public String updatemay(Model model, @ModelAttribute("dk") @Valid DangKy dk, BindingResult result, int trangthai) {
		if(result.hasErrors()) {
			return "/updatemay";
		}
	    trangthai = 1;
		model.addAttribute("update", trangthai);
	     dkservices.updateDangky(dk);
		return "redirect:/trang-chu";
	}
	
}
