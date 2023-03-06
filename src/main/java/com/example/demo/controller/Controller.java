package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController
public class Controller {
	@Autowired
	service s;
	
	@GetMapping("/getClothes")
	public List <model>showDetails(){
		return s.getDetails();
	}
	@PostMapping("/postClothes")
	public String addDetails(@RequestBody model m) {
		s.add(m);
		return "Added product "+m.getId()+ " with brand "+m.getBrand()+" worth "+m.getPrice();
	}
	@PutMapping("/updateClothes")
	public model update(@RequestBody model m) {
		return s.updateDetails(m);
	}
	@DeleteMapping("/deleteClothes/{id}")
	public String deleteInfo(@PathVariable("id") int id){
		s.deleteDetails(id);
		return "Deleted Cloth from store";
	}
	
	@GetMapping("/sortClothes/{field}")
	public List<model> getWithSort(@PathVariable String field){
		return s.getSorted(field);
	}
	@GetMapping("Clothes/{offset}/{pageSize}")
	public List<model> productsWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return s.getWithPagination(offset,pageSize);
	}
}
