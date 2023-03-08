package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personal_details")
public class personal {
	@Id
	private int id;
	private String lastname;
	private int phone;
	private String doorno;
	private String city;
	private String dist;
	private String state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public personal(int id, String lastname, int phone, String doorno, String city, String dist,
			String state) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.phone = phone;
		this.doorno = doorno;
		this.city = city;
		this.dist = dist;
		this.state = state;
	}
	
	public personal() {
		
	}
}
