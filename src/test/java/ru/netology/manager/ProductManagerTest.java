package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Product first = new Book(1, "Queen of spades", 500, "Pushkin");
    Product second = new Book(2, "Dead souls", 650, "Gogol");
    Product third = new Book(3, "Master and Margarita", 730, "Bulgakov");
    Product fourth = new Smartphone(4, "Redmi", 15000, "Xiaomi");
    Product fifth = new Smartphone(5, "Iphone", 75000, "Apple");
    Product sixth = new Smartphone(6, "Galaxy", 27000, "Samsung");
    Product seventh = new Smartphone(7, "Galaxy", 33000, "Samsung");


    @BeforeEach
    public void addAll() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
    }

    @Test
    public void searchByNameBook() {
        assertArrayEquals(manager.searchBy("Dead souls"), new Product[]{second});
    }

    @Test
    public void searchByAuthor() {
        assertArrayEquals(manager.searchBy("Pushkin"), new Product[]{first});
    }

    @Test
    public void searchByManufacture() {
        assertArrayEquals(manager.searchBy("Apple"), new Product[]{fifth});
    }

    @Test
    public void searchByNamePhone() {
        assertArrayEquals(manager.searchBy("Redmi"), new Product[]{fourth});
    }

    @Test
    public void searchBy() {
        assertArrayEquals(manager.searchBy("null"), new Product[]{});
    }

    @Test
    public void shouldSearchSmartphoneManufacture() {
        assertArrayEquals(manager.searchBy("Samsung"), new Product[]{sixth, seventh});
    }
}