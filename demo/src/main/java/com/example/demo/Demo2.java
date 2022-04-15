package com.example.demo;

import com.example.demo.Bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class Demo2 implements CommandLineRunner {
    @Autowired
    private ProductRepository repository;
    public static void main(String[] args) {
        ConfigurableApplicationContext ct = SpringApplication.run(Demo2.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Product(1,"Earphone",1, 2999.00F));
        System.out.println("Product Processing..");
    }
}
