package com.gc.coffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_items",query = "select item from Items item")//JPQL
public class Items {
@Id //this is for a primary key & you always need a primary key for hibernate
private String name;
private String description;
private int quantity;
private double price;
private String picturename;


public Items() {

}



public Items(String name, String description, int quantity, double price, String picturename) {

	this.name = name;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
	this.picturename = picturename;
}





public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}



public String getPicturename() {
	return picturename;
}



public void setPicturename(String picturename) {
	this.picturename = picturename;
}



@Override
public String toString() {
	return "Items [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price + "]";
}



}
