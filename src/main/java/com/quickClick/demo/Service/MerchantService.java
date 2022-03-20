package com.quickClick.demo.Service;

import com.quickClick.demo.Entity.MerchantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface MerchantService  {

    public MerchantEntity getMerchantById(Integer id);
}
