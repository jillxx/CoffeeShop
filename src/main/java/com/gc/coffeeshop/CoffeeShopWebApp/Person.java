package com.gc.coffeeshop.CoffeeShopWebApp;

import org.springframework.stereotype.Component;
@Component
public class Person {
private String firstName;
private String lastName;
private String email;
private int phoneNum;
private String password;



public Person() {

}



public Person(String firstName, String lastName, String email, int phoneNum, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNum = phoneNum;
	this.password = password;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public int getPhoneNum() {
	return phoneNum;
}



public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum=" + phoneNum
			+ ", password=" + password + "]";
}




}
