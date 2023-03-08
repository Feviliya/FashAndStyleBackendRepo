package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.model;
import com.example.demo.model.personal;
import com.example.demo.repository.PersonalRepository;
import com.example.demo.repository.repository;
@Service
public class personalService {
	@Autowired
	PersonalRepository repo;
	
	public String add(personal m) {
		repo.save(m);
		return "Added";
	}
	
	public List <personal> getDetails(){
		return repo.findAll();
	}
	public personal updateDetails(personal m) {
		return repo.saveAndFlush(m);
	}
	public void deleteDetails(int id) {
		repo.deleteById(id);
	}
}
