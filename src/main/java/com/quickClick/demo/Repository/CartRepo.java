package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.CartEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepo extends CrudRepository<CartEntity, Integer> {
}
