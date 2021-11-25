package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    Book book = new Book(1, "book", 1000, "Pushkin");
    Smartphone phone = new Smartphone(1, "phone", 15000, "China");


    @BeforeEach
    public void setUp() {
        repository.save(book);
        repository.save(phone);
    }
}