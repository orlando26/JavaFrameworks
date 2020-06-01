package com.orlando.musicws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orlando.musicws.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
	public Person findByEmail(String email);

}
