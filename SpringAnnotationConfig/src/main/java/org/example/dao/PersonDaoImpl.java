package org.example.dao;



import org.example.constants.EntityConstants;
import org.example.mapper.PersonMapper;
import org.example.models.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class PersonDaoImpl implements PersonDAO{

    JdbcTemplate jdbcTemplate;

    public PersonDaoImpl(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public Person getPersonById(Long id) {
        return jdbcTemplate.queryForObject("Select * from person where id = ?",new Object[]{id}, new PersonMapper());
    }

    public Person create(Person person) {
        jdbcTemplate.update("insert into person("+ EntityConstants.PersonEntity.id+","+EntityConstants.PersonEntity.firstName+","+EntityConstants.PersonEntity.lastName+","+EntityConstants.PersonEntity.age+") values(?,?,?,?)",person.getId(),person.getFirstName(),person.getLastName(),person.getAge());
        return person;
    }

}
