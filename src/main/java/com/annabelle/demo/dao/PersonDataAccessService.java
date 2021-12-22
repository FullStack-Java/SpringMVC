package com.annabelle.demo.dao;

import com.annabelle.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("POSTGRES")
public class PersonDataAccessService implements PersonDao{
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return new ArrayList<>(Arrays.asList(new Person(UUID.randomUUID(), "FROM POSTGRES DB")));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonByID(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonByID(UUID id, Person person) {
        return 0;
    }
}
