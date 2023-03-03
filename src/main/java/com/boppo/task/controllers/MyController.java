package com.boppo.task.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/int")
	@ResponseBody
	public int printInt() {
		return 384;
	}
	
	@GetMapping("/registration")
	@ResponseBody
	public ModelAndView registerUser() {
		ModelAndView mv  = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
}
