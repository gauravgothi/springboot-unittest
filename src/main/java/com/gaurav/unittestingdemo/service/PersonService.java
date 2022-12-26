package com.gaurav.unittestingdemo.service;

import com.gaurav.unittestingdemo.entities.Person;
import com.gaurav.unittestingdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson()  {
        return this.personRepository.findAll();

    }


}
