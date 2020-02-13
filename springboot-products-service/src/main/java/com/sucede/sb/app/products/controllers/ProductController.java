package com.sucede.sb.app.products.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sucede.sb.app.products.models.entity.Product;
import com.sucede.sb.app.products.models.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private Environment env;
	
	@Value("${server.port}")
	private Integer port;

	@Autowired
	private IProductService productService;
	
	@GetMapping("/list")
	public List<Product> list(){
		return productService.findAll().stream().map(p ->{
			//p.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			p.setPort(port);
			return p;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/view/{id}")
	public Product product(@PathVariable Long id) {
		Product product = productService.findById(id);
		//product.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		product.setPort(port);
		return product;
	}
}
