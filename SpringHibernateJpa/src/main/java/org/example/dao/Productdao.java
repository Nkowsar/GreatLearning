package org.example.dao;

import org.example.entity.Product;

import java.util.List;

public interface Productdao {
    public void save(Product product);
    public List<Product> findAll();

}
