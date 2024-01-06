package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
	private ProductService service;
    
    @PostMapping
    public void add(@RequestBody Product p) {
    	service.add(p);
    }
    
    @PutMapping
    @RequestMapping("/{code}")
    public void add(@PathVariable int code,@RequestBody Product p) {
    	service.update(p);
    }
 
}
