package faca.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import faca.training.bean.LichTrinhXe;
import faca.training.bean.Xe;
import faca.training.servie.LoaiXeService;
import faca.training.servie.NhaXeService;
import faca.training.servie.TuyenXeService;
import faca.training.servie.XeServices;

@Controller
public class HomeController {
    @Autowired
    private XeServices xeservice;
    @Autowired
    private LoaiXeService loaixeservice;
    @Autowired
    private NhaXeService nhaxeservice;
    @Autowired
    private TuyenXeService tuyenxeservice;

    
	
	@RequestMapping(value= {"/","/trang-chu"})
	public String home() {
		return "/Home";
	}
	@GetMapping("/themxe")
	public String themxe(Model model) {
		model.addAttribute("xemoi", new Xe());
		model.addAttribute("listloaixe", loaixeservice.findallloaixe());
		model.addAttribute("listnhaxe", nhaxeservice.findallnhaxe());
		return "/ThemXe";
	}
	
	@GetMapping("/showxe")
	public String showlistxe(Model model){
		model.addAttribute("listxe", xeservice.findallXe());
		return "/danhsachxe";
	}
	
	@GetMapping("/themlichtrinh")
	public String themlichtrinh(Model model) {
		model.addAttribute("listxe", xeservice.findallXe());
		model.addAttribute("listtuyenduong", tuyenxeservice.findallTuyenXe());
		model.addAttribute("lichtrinhxe", new LichTrinhXe());
		return "/themlichtrinhxe";
	}
	@GetMapping("/showlichtrinh")
	public String showlichtrinh(Model model) {
		model.addAttribute("listlichtrinh", xeservice.showlichtrinh());
		return "/lichtrinhtuyen";
	}
}
