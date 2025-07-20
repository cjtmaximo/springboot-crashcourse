package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product;

    @BeforeEach
    void setup() {
        product = new Product((long) 1, "2023 MacBook Pro M3", 70000.00);
    }

    @Test
    void testGetId() {
        assertEquals(1, product.getId());
    }

    @Test
    void testSetId() {
        Long newProductId = (long) 2;
        product.setId(newProductId);

        assertEquals(2, product.getId());
    }

    @Test
    void testGetName() {
        assertEquals("2023 MacBook Pro M3", product.getName());
    }

    @Test
    void testSetName() {
        String newProductName = "2024 MacBook Pro M4";
        product.setName(newProductName);

        assertEquals(newProductName, product.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(70000.00, product.getPrice());
    }

    @Test
    void testSetPrice() {
        double newPrice = 69420.00;
        product.setPrice(newPrice);

        assertEquals(newPrice, product.getPrice());
    }

    @Test
    void testToString() {
        assertEquals("Product{id=1, name='2023 MacBook Pro M3', price=70000.0}", product.toString());
    }

    @Test
    void testEquals() {
        Product product2 = new Product((long) 1, "2023 MacBook Pro M3", 70000.00);
        assertTrue(product.equals(product2));
    }

    @Test
    void testHashCode() {
        Product product2 = new Product((long) 1, "2023 MacBook Pro M3", 70000.00);
        assertEquals(product.hashCode(), product2.hashCode());
    }
}