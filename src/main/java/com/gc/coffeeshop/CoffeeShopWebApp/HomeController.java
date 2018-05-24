package com.gc.coffeeshop.CoffeeShopWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	Person p;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "init", "Welcom to GC COFFEE ");
	}

	@RequestMapping("/preRegister")
	public String form() {
		return "register";
	}
	@RequestMapping("/register")
	public ModelAndView formTest(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("email") String email, @RequestParam("phoneNum") long phoneNum,
			@RequestParam("password") String password) {
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setEmail(email);
		p.setPhoneNum(phoneNum);
		p.setPassword(password);

		return new ModelAndView("addUser", "person", p.getFirstName());
	}

}
