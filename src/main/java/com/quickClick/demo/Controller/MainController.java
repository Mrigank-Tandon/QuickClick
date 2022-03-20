package com.quickClick.demo.Controller;

import com.quickClick.demo.Entity.MerchantEntity;
import com.quickClick.demo.Entity.ProductEntity;


import com.quickClick.demo.Service.MerchantService;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.quickClick.demo.Repository.ProductSearch;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("product")
public class MainController {

    @Autowired
    ProductSearch productSearch;

    @Autowired
    ProductService productService;

    @Autowired
    MerchantService merchantService;


    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){

            return productService.getAllProducts();
    }
    @GetMapping("/search")
    public List<ProductEntity> searchProduct(@RequestParam @Valid String keyword){
        return productSearch.searchAllByKeyword(keyword);

    }

    @GetMapping("/merchant")
    public MerchantEntity getMerchantById(@RequestParam @Valid Integer id){
        return merchantService.getMerchantById(id);

    }

    @GetMapping("/products/")
    public ProductEntity getProdById(@RequestParam Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/addproducts")
    public void addProd(@RequestBody ProductEntity product){
        productService.addProducts(product);

    }

    @PutMapping("/updateproducts")
    public void updateProd(@RequestBody ProductEntity product){
        productService.updateProducts(product);

    }

    @DeleteMapping("/deleteprod")
    public void deleteprod(@RequestBody ProductEntity product){
        productService.deleteProducts(product);

    }

}
