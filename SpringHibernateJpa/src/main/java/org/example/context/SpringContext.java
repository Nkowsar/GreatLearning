package org.example.context;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class SpringContext {

    public  static  void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:/spring.xml");
        ProductService productService=context.getBean(ProductService.class);
        productService.save(new Product(5,"bmw"));
        productService.save(new Product(6,"pulsar"));
    }
}
