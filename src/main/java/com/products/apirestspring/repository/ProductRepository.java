package com.products.apirestspring.repository;

import com.products.apirestspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>  {

    Product findById(long id);

}
