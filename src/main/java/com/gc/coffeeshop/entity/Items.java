package com.gc.coffeeshop.entity;

import org.springframework.stereotype.Component;

@Component
public class Items {
private String name;
private String description;
private int quantity;
private double price;


public Items() {

}


public Items(String name, String description, int quantity, double price) {

	this.name = name;
	this.description = description;
	this.quantity = quantity;
	this.price = price;
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


@Override
public String toString() {
	return "Items [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price + "]";
}



}
