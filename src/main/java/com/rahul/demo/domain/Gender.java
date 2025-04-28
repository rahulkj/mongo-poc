package com.rahul.demo.domain;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public class Gender {
	
	@Field(name = "gender")
	private String gender;
	
	@Field(name = "genderAlias")
	private String genderAlias;
}
