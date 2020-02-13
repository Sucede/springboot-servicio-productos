package com.sucede.sb.app.products.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.sucede.sb.app.products.models.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
