package com.quickClick.demo.Service;

import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Merchant;
import com.quickClick.demo.Pojo.Product;
import com.quickClick.demo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;


    @Override
    public List<ProductEntity> getAllProducts() {
        Iterable<ProductEntity> iterable =  productRepo.findAll();
        List<ProductEntity> productEntityList = new ArrayList<>();
        for(ProductEntity productEntity : iterable){
            productEntityList.add(productEntity);
        }
        return productEntityList;
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return null;
    }

    @Override
    public void addProducts(ProductEntity product) {

    }
}
