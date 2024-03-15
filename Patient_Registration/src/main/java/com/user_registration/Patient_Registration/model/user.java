package com.user_registration.Patient_Registration.model;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // it tells the system that objects of this persistence class can be mapped to a database table.
@Table(name = "patients") 
public class user {
	
	@Id //Primary key of the Entity (user)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // How to generate the value for ID value
	private Long id;
	
	
	private String first_name;
	private String middle_name;	
	private String last_name;
	
	private Integer age;
	private BigInteger mobile;
	private String city;
	private String gender;
	private String disease;
	
	public user() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the mobile
	 */
	public BigInteger getMobile() {
		return mobile;
	}

	/**
	 * @param mobileNumber the mobile to set
	 */
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
