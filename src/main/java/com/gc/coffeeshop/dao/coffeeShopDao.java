package com.gc.coffeeshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gc.coffeeshop.entity.Items;
import com.gc.coffeeshop.entity.Person;




@Repository
@Transactional 
public class coffeeShopDao {

	@Autowired
	JdbcTemplate jdbcTemplate;//jar from the spring framework
	

	@PersistenceContext  //entities are stored in the persistence context and 
	//EntityManager is an interface that manages this process.
	EntityManager eManager; //allows us to manage all of the entities in our project
	
	public void addUser(Person p) {
		String sql = "INSERT INTO users (`firstName`, `lastName`, `email`, `phoneNum`, `password`,`gender`,`zipcode`,`favorite`) VALUES(?,?,?,?,?,?,?,?)";
	
		System.out.println(p);
		jdbcTemplate.update(sql, p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhoneNum(), p.getPassword(), p.getGender(), p.getZipcode(), p.getFavorite());
	}
	
	
	public List<Items> findAll() {
		String sql = "SELECT*FROM items";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
	}
	
	public List<Items> search(String name){
		
		String sql = "SELECT * FROM items WHERE name like '%" + name + "%'";
		//insert the parameter into the sql command.
		
		
	
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
	}
	
	public Items update(Items item) {
		return eManager.merge(item);
		
	}
	
	public void deleteByName(String name) {
		Items item = eManager.find(Items.class,	name);
		eManager.remove(item);
	}
}
