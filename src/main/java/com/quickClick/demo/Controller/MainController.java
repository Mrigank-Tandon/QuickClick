package com.quickClick.demo.Controller;

import com.quickClick.demo.Entity.MerchantEntity;
import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;
//<<<<<<< HEAD
import com.quickClick.demo.Service.MerchantService;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//=======
import com.quickClick.demo.Repository.ProductSearch;
//import com.quickClick.demo.Service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.web.bind.annotation.*;
//>>>>>>> 803826345933dfc4c751216e6010eea702d81553

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("product")
public class MainController {

    @Autowired
    ProductSearch productSearch;

    @Autowired
    ProductService productService;

//<<<<<<< HEAD
//    @Autowired
//    MerchantService merchantService;
//
//    @GetMapping("/products")
//    public List<ProductEntity> getStudent(){
//        return productService.getAllProducts();
//=======
    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){

            return productService.getAllProducts();

    }
    @GetMapping("/search")
    public List<ProductEntity> searchProduct(@RequestParam @Valid String keyword){
        return productSearch.searchAllByKeyword(keyword);

    }

//    @GetMapping("/merchant/")
//    public MerchantEntity getMerchantById(@RequestParam @Valid Integer id){
//        return merchantService.getMerchantById(id);
//    }







}
