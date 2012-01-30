package com.rahul.poc.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.roo.addon.layers.service.RooService;

import com.rahul.poc.domain.Gender;

@RooService(domainTypes = { com.rahul.poc.domain.Gender.class })
public interface GenderService {
	public long countAllGenders();
    
    public void deleteGender(Gender gender);    
    public Gender findGender(BigInteger id);
    
    public List<Gender> findAllGenders();
    
    public List<Gender> findGenderEntries(int firstResult, int maxResults);
    
    public void saveGender(Gender gender);
    
    public Gender updateGender(Gender gender);
}
