package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository productRepository;

    @BeforeEach
    void setup() {
        productRepository = new ProductRepository();
    }

    @Test
    void productRepositoryHasExactlyThreeProducts() {
        List<Product> products = productRepository.findAll();
        assertEquals(3, products.size());
    }

    @Test
    void getLaptopFindById() {
        Optional<Product> product = productRepository.findById((long) 1);
        Product product1 = product.get();

        assertEquals(1, product1.getId());
        assertEquals("Laptop", product1.getName());
        assertEquals(1200.00, product1.getPrice());
    }

    @Test
    void nonExistingProductFindById() {
        Optional<Product> product = productRepository.findById((long) 4);
        assertTrue(product.isEmpty());
    }

    @Test
    void saveProductWithoutAnId() {
        Product newProduct = new Product("Not A Laptop", 100.00);
        productRepository.save(newProduct);

        assertEquals(4, productRepository.findAll().size());
        assertEquals(4, newProduct.getId());
        assertEquals("Not A Laptop", newProduct.getName());
        assertEquals(100.00, newProduct.getPrice());
    }

    @Test
    void saveExistingProduct() {
        Optional<Product> product = productRepository.findById((long) 1);
        Product product1 = product.get();
        product1.setPrice(1000.00);

        productRepository.save(product1);

        assertEquals(1, product1.getId());
        assertEquals("Laptop", product1.getName());
        assertEquals(1000.00, product1.getPrice());
    }
}