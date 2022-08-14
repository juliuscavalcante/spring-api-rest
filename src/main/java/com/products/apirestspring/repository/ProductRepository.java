package com.products.apirestspring.repository;

import com.products.apirestspring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {

    Product findById(long id);

}
