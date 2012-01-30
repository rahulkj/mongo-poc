package com.rahul.poc.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;

import com.rahul.poc.domain.Gender;
import com.rahul.poc.repository.GenderRepository;


public class GenderServiceImpl implements GenderService {
	
	@Autowired
	GenderRepository genderRepository;
	
	public long countAllGenders() {
        return genderRepository.count();
    }
    
	@Secured({"ROLE_ADMIN"})
    public void deleteGender(Gender gender) {
        genderRepository.delete(gender);
    }
    
    public Gender findGender(BigInteger id) {
        return genderRepository.findOne(id);
    }
    
    public List<Gender> findAllGenders() {
        return genderRepository.findAll();
    }
    
    public List<Gender> findGenderEntries(int firstResult, int maxResults) {
        return genderRepository.findAll(new org.springframework.data.domain.PageRequest(firstResult / maxResults, maxResults)).getContent();
    }
    
    @Secured({"ROLE_ADMIN"})
    public void saveGender(Gender gender) {
        genderRepository.save(gender);
    }
    
    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    public Gender updateGender(Gender gender) {
        return genderRepository.save(gender);
    }
}
