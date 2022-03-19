package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends CrudRepository<CartEntity, Integer> {
}
