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
		return "register";
	}

	@RequestMapping("/register")
	public ModelAndView formTest(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName,
			@RequestParam("email") String email, @RequestParam("phoneNum") long phoneNum,
			@RequestParam("password") String password, @RequestParam("gender") String gender,
			@RequestParam("zipcode") int zipcode, @RequestParam("favorite") String favorite) {

		Person p = new Person(firstName, lastName, email, phoneNum, password, gender, zipcode, favorite);

		coffeeDao.addUser(p);

		return new ModelAndView("addUser", "userfirstname", p.getFirstName());
	}

	@RequestMapping("/search")
	public ModelAndView searchResult(@RequestParam("name") String name) {
		List<Items> searchItems = coffeeDao.search(name);

		return new ModelAndView("searchResult", "searchItems", searchItems);
	}

	@RequestMapping("/editItems")
	public ModelAndView edit(@RequestParam("name") String name) {
		return new ModelAndView("update", "name", name);
	}

	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("name") String name, @RequestParam("description") String description,
			@RequestParam("quantity") int quantity, @RequestParam("price") double price,
			@RequestParam("picturename") String picname) {
		Items item = new Items(name, description, quantity, price, picname);
		coffeeDao.update(item);
		return new ModelAndView("index", "items", coffeeDao.findAll());

	}

	@RequestMapping("/deleteItem")
	public ModelAndView delete(@RequestParam("name") String name) {

		coffeeDao.deleteByName(name);
		return new ModelAndView("index", "items", coffeeDao.findAll());
	}

	@RequestMapping("/addItem")
	public String addfrom() {
		return "addItem";
	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("name") String name, @RequestParam("description") String description,
			@RequestParam("quantity") int quantity, @RequestParam("price") double price,
			@RequestParam("picturename") String picname) {
		Items item = new Items(name, description, quantity, price, picname);
		coffeeDao.update(item);
		return new ModelAndView("index", "items", coffeeDao.findAll());
	}
}