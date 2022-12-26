package com.gaurav.unittestingdemo.repository;

import com.gaurav.unittestingdemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    @Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Person s where s.personId=?1")
    Boolean isPersonExistById(Integer id);


}
