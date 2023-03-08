package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SignUp")
public class Signup {
	@Id
	private int id;
	private String username;
	private String mail;
	private String gender;
	private String pwd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Signup(int id, String username, String mail, String gender, String pwd) {
		super();
		this.id = id;
		this.username = username;
		this.mail = mail;
		this.gender = gender;
		this.pwd = pwd;
	}
	
	public Signup() {
		
	}
}
