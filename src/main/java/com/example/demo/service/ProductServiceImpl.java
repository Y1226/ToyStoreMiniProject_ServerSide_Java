package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductsRepository;
import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired //  משמש לנו על מנת לקבל את האובייקט שנוצר מאחורי הקלעים שנוצר עי ספרינג בוט 
    private ProductsRepository rep;

	@Override
	public void add(Product p) {
		if(rep.existsById(p.getCode()))
			throw new RuntimeException("the key: "+ p.getCode()+" exist in DB !!!");
		rep.save(p);
	}

	@Override
	public void deleteByCode(int code) {
		rep.deleteById(code);
	}

	@Override
	public void update(Product p) {
		if(!rep.existsById(p.getCode()))
			throw new RuntimeException("the key: "+ p.getCode()+"does not exist in DB !!!");
		rep.save(p);
		
	}

	@Override
	public List<Product> getAll() {
		ArrayList<Product> listAll= new ArrayList<>();
		rep.findAll().forEach(p->listAll.add(p));
		return listAll;
	}
	
}
