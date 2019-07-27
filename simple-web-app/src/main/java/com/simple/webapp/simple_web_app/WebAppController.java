package com.simple.webapp.simple_web_app;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebAppController {

	@RequestMapping("/home")
	//@ResponseBody
	public String home(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		HttpSession ses = req.getSession();
		ses.setAttribute("name", name);
		return "home.jsp";
	}
}
