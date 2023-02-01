package com.colossus.ecomerce.dao;

import com.colossus.ecomerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
