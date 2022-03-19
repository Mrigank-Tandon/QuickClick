package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.UserDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserDetailsEntity, Integer> {

}
