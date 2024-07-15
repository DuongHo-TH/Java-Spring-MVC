package faca.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MathController {

	@RequestMapping("/")
	public String showacb() {
		return "/Home";
	}

	@RequestMapping("/doMath")
	public ModelAndView calculateSum(@RequestParam("numbera") int a, @RequestParam("numberb") int b) {
		ModelAndView model = new ModelAndView("MathResult");
		model.addObject("sum", (a + b));
		model.addObject("subtract", (a - b));
		model.addObject("multiply", (a * b));
		model.addObject("divide", (a / b));
		return model;
	}
}
