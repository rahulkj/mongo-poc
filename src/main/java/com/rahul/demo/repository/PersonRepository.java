package com.rahul.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rahul.demo.domain.Person;

public interface PersonRepository extends MongoRepository<Person, String>{

}
