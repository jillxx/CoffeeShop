package com.gc.coffeeshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gc.coffeeshop.entity.Items;
import com.gc.coffeeshop.entity.Person;




@Repository
public class coffeeShopDao {

	@Autowired
	JdbcTemplate jdbcTemplate;//jar from the spring framework
	
	
	public void addUser(Person p) {
		String sql = "INSERT INTO users (`firstName`, `lastName`, `email`, `phoneNum`, `password`) VALUES(?,?,?,?,?)";
	
		System.out.println(p);
		jdbcTemplate.update(sql, p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhoneNum(), p.getPassword());
	}
	
	
	public List<Items> findAll() {
		String sql = "SELECT*FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
	}
	
//	public Items Search (String name){
//		String sql = "SELECT*FROM items WHERE name = ?"; 
//		
//		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Items.class));
//	}
}
