package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signup;
import com.example.demo.model.model;
import com.example.demo.service.SignUpService;
import com.example.demo.service.service;

@CrossOrigin
@RestController
public class SignUpController {
	@Autowired
	SignUpService s;
	
	@GetMapping("/getUser")
	public List <Signup>showDetails(){
		return s.getDetails();
	}
	@PostMapping("/postUser")
	public String addDetails(@RequestBody Signup m) {
		s.add(m);
		return "Added user "+m.getUsername();
	}
	@PutMapping("/updateUser")
	public Signup update(@RequestBody Signup m) {
		return s.updateDetails(m);
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteInfo(@PathVariable("id") int id){
		s.deleteDetails(id);
		return "Deleted Cloth from store";
	}
	
}
