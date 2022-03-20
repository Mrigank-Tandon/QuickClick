package com.quickClick.demo.Controller;

import com.quickClick.demo.Entity.ProductEntity;
import com.quickClick.demo.Pojo.Product;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Products")
public class MainController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getStudent(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/")
    public ProductEntity getProdById(@RequestParam Integer id){
        return productService.getProductById(id);
    }

    @PostMapping("/addproducts")
    public void addProd(@RequestBody ProductEntity product){
        productService.addProducts(product);
        return;
    }

    @PutMapping("/updateproducts")
    public void updateProd(@RequestBody ProductEntity product){
        productService.updateProducts(product);
        return;
    }

    @DeleteMapping("/deleteprod")
    public void deleteprod(@RequestBody ProductEntity product){
        productService.deleteProducts(product);
        return;
    }

}
