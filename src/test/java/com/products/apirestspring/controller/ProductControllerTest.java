package com.products.apirestspring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.products.apirestspring.model.Product;
import com.products.apirestspring.repository.ProductRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @MockBean
    private ProductRepository productRepository;

    Product PRODUCT_1 = new Product(1, "Headset",  new BigDecimal(5), new BigDecimal(49.90));
    Product PRODUCT_2 = new Product(2, "Mouse",  new BigDecimal(5), new BigDecimal(69.90));
    Product PRODUCT_3 = new Product(3, "Keyboard",  new BigDecimal(5), new BigDecimal(99.90));

    @Test
    public void getAllProducts_sucess() throws Exception {
        List<Product> products = new ArrayList<>(Arrays.asList(PRODUCT_1, PRODUCT_2, PRODUCT_3));

        Mockito.when(productRepository.findAll()).thenReturn(products);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/products")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(3)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].name", Matchers.is("Keyboard")));
    }

    @Test
    public void getProductById_sucess() throws Exception {
        Mockito.when(productRepository.findById(PRODUCT_1.getId())).thenReturn(PRODUCT_1);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/product/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.notNullValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("Headset")));
    }

    @Test
    public void createProduct_sucess() throws Exception {
        Product product = new Product(9, "AirDot", new BigDecimal(5), new BigDecimal(129.90));

        Mockito.when(productRepository.save(product)).thenReturn(product);

        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.post("/api/product")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(this.mapper.writeValueAsString(product));

        mockMvc.perform(mockHttpServletRequestBuilder)
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.notNullValue()))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("AirDot")));
        }
    }

