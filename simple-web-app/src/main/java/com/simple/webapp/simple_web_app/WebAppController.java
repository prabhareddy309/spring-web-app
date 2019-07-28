package com.simple.webapp.simple_web_app;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebAppController {

	@RequestMapping("/home")
	//@ResponseBody
	public ModelAndView home(Student student) {
		//String name = name1;
		//HttpSession ses = req.getSession();
		//ses.setAttribute("name", name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", student);
		mv.setViewName("home.jsp");
		//return "home.jsp";
		return mv;
	}
}
