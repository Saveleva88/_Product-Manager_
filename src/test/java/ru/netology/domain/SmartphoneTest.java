package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book = new Book();
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
        }
    }

    @Test
    public void shouldNotCastToDifferentClass() {
        Product product = new Smartphone();
        Smartphone phone = (Smartphone) product;
    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Smartphone();
        product.toString();
    }
    @Test
    public void shouldUseEquals() {
        Smartphone first = new Smartphone(1, "Phone", 9000, "Xiaomi");
        Smartphone second = new Smartphone(1, "Phone", 9000,"Xiaomi");
        assertEquals(first, second);
    }
}