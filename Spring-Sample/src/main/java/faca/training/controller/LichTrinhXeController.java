package faca.training.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import faca.training.bean.LichTrinhXe;
import faca.training.servie.LichTrinhXeService;

@Controller
public class LichTrinhXeController {
@Autowired
private LichTrinhXeService lichtrinhservice;

	
	@PostMapping("/savelichtrinh")
	public String savelichtrinh(@ModelAttribute("lichtrinhxe") @Valid LichTrinhXe lichtrinh, BindingResult result) {
		if(result.hasErrors()) {
			return "/themlichtrinhxe";
		}
		lichtrinhservice.savelichtrinh(lichtrinh);
		return "/Home";
		
	}
	
	
}
