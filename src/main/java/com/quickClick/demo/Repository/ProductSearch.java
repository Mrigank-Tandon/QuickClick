package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

public interface ProductSearch extends JpaRepository<ProductEntity,Integer> {
    @Query("SELECT p FROM ProductEntity p WHERE CONCAT(p.productName,p.productCategory,p.productDescription) LIKE %?1%")
    public List<ProductEntity> searchAllByKeyword(String keyword);





}
