package org.example.dao;

import org.example.entity.Product;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
public class ProductDaoImpl implements Productdao{
    @PersistenceContext
    private EntityManager entityManager;
    public  void  save(Product product){
        entityManager.persist(product);
    }

    @Override
    public List<Product> findAll() {
        return entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }
}
