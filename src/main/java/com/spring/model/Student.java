package com.spring.model;

import java.util.HashMap;

public class Student {
	
	private String fName;
	private String lName;
	private String age;
	private String country;
	private HashMap<String, String> countryOption;
	private String language;
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
	
	

}
