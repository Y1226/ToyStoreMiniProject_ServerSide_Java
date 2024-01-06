package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
   void add(Product p);
   void deleteByCode(int code);
   void update(Product p);
   List<Product> getAll();
   
}
