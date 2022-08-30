package org.example.junkDealer;

import org.example.junkDealer.Product;

public class ProductRepo {

    public Product[] products = new Product[0];

    public void saveNewItem(Product item) {
        Product[] tmp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = item;
        products = tmp;
    }

    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;

        for (Product item : products) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        products = tmp;
    }
}
