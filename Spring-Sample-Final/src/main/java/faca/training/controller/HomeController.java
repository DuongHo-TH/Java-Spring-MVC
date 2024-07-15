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
import org.springframework.web.bind.annotation.RequestMapping;

import faca.training.bean.LichTrinhXe;
import faca.training.bean.LoaiXe;
import faca.training.bean.NhaXe;
import faca.training.bean.Xe;
import faca.training.servie.LichTrinhXeService;
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
	@Autowired
	private LichTrinhXeService lichtrinhservice;

	@RequestMapping(value = { "/", "/trang-chu" })
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

	@PostMapping("/luuthongtinxe")
	public String savexe(Model model, @ModelAttribute("xemoi") @Valid Xe xe, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("listloaixe", loaixeservice.findallloaixe());
			model.addAttribute("listnhaxe", nhaxeservice.findallnhaxe());
			return "/ThemXe";
		}
		xeservice.savexe(xe);
		return "/Home";
	}

	@GetMapping("/themlichtrinh")
	public String themlichtrinh(Model model) {
		model.addAttribute("listxe", xeservice.findallXe());
		model.addAttribute("listtuyenxe", tuyenxeservice.findallTuyenXe());
		model.addAttribute("lichtrinh", new LichTrinhXe());
		return "/themlichtrinhxe";
	}
	@PostMapping("/savelichtrinh")
	public String savelichtrinh(@ModelAttribute("lichtrinh") @Valid LichTrinhXe lichtrinh, BindingResult result) {
		if(result.hasErrors()) {
			return "/themlichtrinhxe";
		}
		Xe xe = xeservice.findByIdXe(lichtrinh.getIdlichtrinh().getMaxe());
		lichtrinh.setXe(xe);
		lichtrinhservice.saveLichTrinh(lichtrinh);
		return "redirect:/showxe";
	}

	@GetMapping("/showxe")
	public String showXe(Model model) {
		model.addAttribute("listxe", xeservice.findallXe());
		return "/danhsachxe";
	}

	@ModelAttribute("listloaixe")
	public List<LoaiXe> maLoaiXe() {
		return loaixeservice.findallloaixe();
	}

	@ModelAttribute("listnhaxe")
	public List<NhaXe> maNhaXe() {
		return nhaxeservice.findallnhaxe();
	}
}
