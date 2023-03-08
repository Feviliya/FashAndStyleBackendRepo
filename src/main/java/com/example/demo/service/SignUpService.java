package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Signup;
import com.example.demo.repository.SignUpRepo;
@Service
public class SignUpService {
	@Autowired
	SignUpRepo repo;
	
	public String add(Signup m) {
		repo.save(m);
		return "Added";
	}
	
	public List <Signup> getDetails(){
		return repo.findAll();
	}
	public Signup updateDetails(Signup m) {
		return repo.saveAndFlush(m);
	}
	public void deleteDetails(int id) {
		repo.deleteById(id);
	}
	public List <Signup> getSorted(String field){
		return repo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<Signup> getWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<Signup> page=repo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
}
