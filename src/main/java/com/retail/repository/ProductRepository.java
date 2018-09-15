package com.retail.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.retail.db.models.Products;

public interface ProductRepository extends Repository<Products, Long> {
	List<Products> findAll();
	Products findOneById(Long id);
}
