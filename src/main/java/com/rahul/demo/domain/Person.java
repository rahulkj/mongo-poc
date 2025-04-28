package com.rahul.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "persons")
@Data
public class Person {
	@Id
    private String id;
	
	@Field(name = "first_name")
	private String firstName;
	
	@Field(name = "last_name")
	private String lastName;
	
	@Field(name = "gender")
	private Gender gender;
}
