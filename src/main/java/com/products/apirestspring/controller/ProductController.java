package com.products.apirestspring.controller;

import com.products.apirestspring.model.Product;
import com.products.apirestspring.repository.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Products API REST")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    @ApiOperation(value = "Returns a list of products")
    public List<Product> productList() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    @ApiOperation(value = "Returns a product by it's id")
    public Product uniqueProductById(@PathVariable(value = "id") long id) {
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    @ApiOperation(value = "Create a new product to the list")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping("/product/{id}")
    @ApiOperation(value = "Delete a product from the list")
    public void deleteProductById(@PathVariable(value = "id")long id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/product")
    @ApiOperation(value = "Update a product from the list")
    public Product updateProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
