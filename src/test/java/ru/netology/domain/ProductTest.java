package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void shouldUseEquals() {
        Product first = new Product(1, "name", 90);
        Product second = new Product(1, "name", 90);
        assertEquals(first, second);
    }
}