package com.gc.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gc.coffeeshop.dao.coffeeShopDao;
import com.gc.coffeeshop.entity.Items;
import com.gc.coffeeshop.entity.Person;

@Controller
public class HomeController {
	@Autowired
	private coffeeShopDao coffeeDao;
	
	@RequestMapping("/")
	public ModelAndView itemList() {
		List<Items> items = coffeeDao.findAll();
		return new ModelAndView("index", "items", items);
	}

	@RequestMapping("/preRegister")
	public String form() {
		return "/register";
	}

	@RequestMapping("/register")
	public ModelAndView formTest(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("email") String email, @RequestParam("phoneNum") long phoneNum,
			@RequestParam("password") String password) {

		Person p = new Person(firstName, lastName, email, phoneNum, password);

		coffeeDao.addUser(p);

		return new ModelAndView("addUser", "userfirstname", p.getFirstName());
	}


}
