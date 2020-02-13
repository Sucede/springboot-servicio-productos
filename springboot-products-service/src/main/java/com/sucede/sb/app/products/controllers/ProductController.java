package com.sucede.sb.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sucede.sb.app.products.models.entity.Product;
import com.sucede.sb.app.products.models.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@GetMapping("/list")
	public List<Product> list(){
		return productService.findAll();
	}
	
	@GetMapping("/view/{id}")
	public Product product(@PathVariable Long id) {
		return productService.findById(id);
	}
}
