package com.quickClick.demo.Repository;

import com.quickClick.demo.Entity.MerchantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MerchantRepo extends CrudRepository<MerchantEntity, Integer> {

}
