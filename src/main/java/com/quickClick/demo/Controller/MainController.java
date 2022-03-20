package com.quickClick.demo.Controller;

import com.quickClick.demo.Entity.MerchantEntity;
import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;
import com.quickClick.demo.Service.MerchantService;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("Products")
public class MainController {

    @Autowired
    ProductService productService;

    @Autowired
    MerchantService merchantService;

    @GetMapping("/products")
    public List<ProductEntity> getStudent(){
        return productService.getAllProducts();
    }

    @GetMapping("/merchant/")
    public MerchantEntity getMerchantById(@RequestParam @Valid Integer id){
        return merchantService.getMerchantById(id);
    }


}
