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


import com.example.demo.model.personal;
import com.example.demo.service.personalService;

@CrossOrigin
@RestController
public class PersonalController {
	@Autowired
	personalService s;
	
	@GetMapping("/getPersonal")
	public List <personal>showDetails(){
		return s.getDetails();
	}
	@PostMapping("/postPersonal")
	public String addDetails(@RequestBody personal m) {
		s.add(m);
		return "Added Client "+m.getId();
	}
	@PutMapping("/updatePersonal")
	public personal update(@RequestBody personal m) {
		return s.updateDetails(m);
	}
	@DeleteMapping("/deletePersonal/{id}")
	public String deleteInfo(@PathVariable("id") int id){
		s.deleteDetails(id);
		return "Deleted Cloth from store";
	}
	
}
