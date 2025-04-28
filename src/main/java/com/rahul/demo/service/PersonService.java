package com.rahul.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.demo.domain.Person;
import com.rahul.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}
	
	public Person getPersonById(String id) {
		return personRepository.findById(id).orElse(null);
	}
	
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	public void deletePerson(String id) {
		personRepository.deleteById(id);
	}
}
