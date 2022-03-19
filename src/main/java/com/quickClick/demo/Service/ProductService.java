package com.quickClick.demo.Service;

import com.quickClick.demo.Pojo.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Integer id);
    void addProducts(Product product);
}
