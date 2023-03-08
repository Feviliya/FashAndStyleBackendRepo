package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.personal;

public interface PersonalRepository extends JpaRepository<personal, Integer> {

}
