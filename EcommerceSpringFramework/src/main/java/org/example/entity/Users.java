package org.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Users {

    private int id;
    private String name;
    List<String> cart;
}
