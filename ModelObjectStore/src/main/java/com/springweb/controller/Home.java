package com.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springweb.model.Student;

@Controller
public class Home {

	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myname) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("myname", myname);
		mv.setViewName("home");

		return mv;
	}

	@RequestMapping("store")
	public ModelAndView store(Student stu) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", stu);
		mv.setViewName("store");

		return mv;

	}

}
