package com.rahul.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.demo.domain.Person;
import com.rahul.demo.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}
	
	@GetMapping("/id")
	public Person getPersonById(@PathVariable String id) {
		return personService.getPersonById(id);
	}

	
	@PostMapping
	public ResponseEntity<Person> createPerson(@RequestBody Person person) {
	    person =  personService.createPerson(person);
		return ResponseEntity
	            .status(HttpStatus.CREATED)
	            .body(person);
	}
	
	@DeleteMapping("/id")
	public void deletePerson(@PathVariable String id) {
		personService.deletePerson(id);
	}
}
