package com.quickClick.demo.Service;

import com.quickClick.demo.Entity.MerchantEntity;
import com.quickClick.demo.Repository.MerchantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MerchantImpl implements MerchantService {

    @Autowired
    MerchantRepo merchantRepo;

    @Override
    public MerchantEntity getMerchantById(Integer id) {
        Optional<MerchantEntity> optionalMerchantEntity = merchantRepo.findById(id);
        MerchantEntity merchantEntity = optionalMerchantEntity.get();
        return merchantEntity;
    }
}
