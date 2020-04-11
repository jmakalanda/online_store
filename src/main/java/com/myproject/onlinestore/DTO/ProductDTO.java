package com.myproject.onlinestore.DTO;

import com.myproject.onlinestore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
    List<Product> products;

    public ProductDTO() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
