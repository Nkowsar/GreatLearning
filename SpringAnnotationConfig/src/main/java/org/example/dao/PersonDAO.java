package org.example.dao;


import org.example.models.Person;

public interface PersonDAO {

    Person getPersonById(Long id);

    Person create(Person person);
}
