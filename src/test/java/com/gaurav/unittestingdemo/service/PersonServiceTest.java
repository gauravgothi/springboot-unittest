package com.gaurav.unittestingdemo.service;

import com.gaurav.unittestingdemo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;


    @Test
    void getAllPerson() {
        personService.getAllPerson();
    }
}