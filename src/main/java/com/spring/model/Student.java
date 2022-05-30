package com.spring.model;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message="Required")
	@Size(min=3, message="Required")
	private String fName;
	
	@NotNull(message="required")
	@Size(min=3, message="required")
	private String lName;
	
	@NotNull(message="Required")
	@Min(value = 20, message="Age Must Be Greater Than OR Equal 20")
	@Max(value=50, message="Age Must Be Less Than OR Equal 50")
	private String age;
	
	private String country;
	private HashMap<String, String> countryOption;
	private String language;
	private String[] players;
	public Student() {
		countryOption = new HashMap<>();
		countryOption.put("Egypt", "EG");
		countryOption.put("France", "FR");
		countryOption.put("Germany", "GR");
		countryOption.put("Brazel", "BR");
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public HashMap<String, String> getCountryOption() {
		return countryOption;
	}
	public void setCountryOption(HashMap<String, String> countryOption) {
		this.countryOption = countryOption;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String[] getPlayers() {
		return players;
	}
	public void setPlayers(String[] players) {
		this.players = players;
	}
	
	

}
