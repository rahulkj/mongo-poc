package com.rahul.poc.repository;

import com.rahul.poc.domain.Person;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Person.class)
public interface PersonRepository {

    List<com.rahul.poc.domain.Person> findAll();
}
