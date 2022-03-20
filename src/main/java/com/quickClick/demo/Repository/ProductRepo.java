package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<ProductEntity, Integer> {
}
