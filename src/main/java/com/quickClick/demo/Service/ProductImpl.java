package com.quickClick.demo.Service;

import com.quickClick.demo.Entity.ProductEntity;
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
    public List<Product> getAllProducts() {

        List<Product> list= new ArrayList<>();
        Iterable<ProductEntity> productEntities = productRepo.findAll();
        for(ProductEntity productEntity : productEntities){
            Product product = new Product(productEntity.getProductId(), productEntity.getProductName() ,
                    productEntity.getProductDescription()
            , productEntity.getProductPrice() , productEntity.getProductWeight() ,
                    productEntity.getProductCategory(), productEntity.getMerchantId()
            , productEntity.getQunatityAvailable() , productEntity.getRating() , productEntity.getReview()
                    , productEntity.getImageSource());
            list.add(product);
        }

        return list;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public void addProducts(Product product) {
        productRepo.save(new ProductEntity(product.getProduct_id() , product.getProduct_name(), product.getProduct_description()
        ,product.getProduct_prize() , product.getProduct_weight() , product.getProduct_category() , product.getMerchant_id() ,
                product.getQunatity_available() , product.getRating() , product.getReview() , product.getImageSource()));
    }


}
