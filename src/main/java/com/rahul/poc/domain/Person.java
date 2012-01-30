package com.rahul.poc.domain;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Person {

    @NotNull
    private String fName;

    @NotNull
    private String lName;

    @DBRef
    @NotNull
    @ManyToOne
    private Gender gender;
}
