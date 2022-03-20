package com.quickClick.demo.Controller;

import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;
import com.quickClick.demo.Repository.ProductSearch;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("product")
public class MainController {

    @Autowired
    ProductSearch productSearch;

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts(){

            return productService.getAllProducts();

    }
    @GetMapping("/search")
    public List<ProductEntity> searchProduct(@RequestParam @Valid String keyword){
        return productSearch.searchAllByKeyword(keyword);
    }







}
