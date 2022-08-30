package org.example.junkDealer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdManagerTest {

    @Test
    public void name() {
        Book book1 = new Book(31, "bk31", 500, "The man in the High Castle", "Phillip K. Dick");
        Book book2 = new Book(72, "bk72", 800, "Dune", "Frank Herbert");
        Book book3 = new Book(12, "bk12", 1000, "Lord of the Rings", "Joh R.R. Tolkien");
        Book book4 = new Book(46, "bk46", 450, "На краю Ойкумены", "Иван Ефремов");

        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);

        manager.addNewItem(book1);
        manager.addNewItem(book2);
        manager.addNewItem(book3);
        manager.addNewItem(book4);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("Dune");

        Assertions.assertArrayEquals(expected, actual);
    }

}
