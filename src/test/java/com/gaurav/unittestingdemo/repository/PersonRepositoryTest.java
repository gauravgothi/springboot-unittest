package com.gaurav.unittestingdemo.repository;

import com.gaurav.unittestingdemo.entities.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void isPersonExistById() {

        Person person = new Person(1234,"Gaurav Gothi","Indore");
        personRepository.save(person);

        Boolean result = personRepository.isPersonExistById(person.getPersonId());

        assertThat(result).isTrue();

    }
}