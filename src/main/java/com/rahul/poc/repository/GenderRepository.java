package com.rahul.poc.repository;

import com.rahul.poc.domain.Gender;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Gender.class)
public interface GenderRepository {

    List<com.rahul.poc.domain.Gender> findAll();
}
