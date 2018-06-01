package com.gc.coffeeshop.entity;

import org.springframework.stereotype.Component;
@Component
public class Person {
private String firstName;
private String lastName;
private String email;
private long phoneNum;
private String password;
private String gender;
private int zipcode;
private String favorite;

public Person(){

}




public Person(String firstName, String lastName, String email, long phoneNum, String password, String gender,
		int zipcode, String favorite) {

	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNum = phoneNum;
	this.password = password;
	this.gender = gender;
	this.zipcode = zipcode;
	this.favorite = favorite;
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



public long getPhoneNum() {
	return phoneNum;
}



public void setPhoneNum(long phoneNum) {
	this.phoneNum = phoneNum;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}




public String getGender() {
	return gender;
}




public void setGender(String gender) {
	this.gender = gender;
}




public int getZipcode() {
	return zipcode;
}




public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}




public String getFavorite() {
	return favorite;
}




public void setFavorite(String favorite) {
	this.favorite = favorite;
}




@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum=" + phoneNum
			+ ", password=" + password + ", gender=" + gender + ", zipcode=" + zipcode + ", favorite=" + favorite + "]";
}






}
