package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SortPage")
public class model {
	@Id
	private int id;
	private String brand;
	private String price;
	private String imgurl;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public model(String name, int id, String price,String imgurl) {
		super();
		this.brand = name;
		this.id = id;
		this.price = price;
		this.imgurl=imgurl;
	}
	@Override
	public String toString() {
		return "model [name=" + brand + ", id=" + id + ", email=" + price + "]";
	}
	
	public model() {
		
	}
}
