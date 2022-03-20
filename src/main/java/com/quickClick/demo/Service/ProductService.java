package com.quickClick.demo.Service;

import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getAllProducts();
    ProductEntity getProductById(Integer id);
    void addProducts(ProductEntity product);
    void updateProducts(ProductEntity product);
    void deleteProducts(ProductEntity product);
}
