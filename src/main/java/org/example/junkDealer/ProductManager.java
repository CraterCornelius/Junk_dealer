package org.example.junkDealer;

import org.example.junkDealer.Product;

public class ProductManager {

    protected ProductRepo repo;

    public ProductManager(ProductRepo repo) {
        this.repo = repo;
    }

    public void addNewItem(Product item) {
        repo.saveNewItem(item);
    }

    public Product[] findAll() {
        return repo.findAll();
    }

    public boolean matches(Product item, String search) {
        if (item.getName().contains(search)) {
            return true;
        } else {
            return false;
        }

    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product item : repo.findAll()) {
            if (matches(item, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }

        return result;
    }
}

