package org.example.service;

import org.example.dao.Productdao;
import org.example.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ProductService {
    @Autowired
    Productdao productdao;
    @Transactional
    public void save(Product product){
        productdao.save(product);
    }
}
