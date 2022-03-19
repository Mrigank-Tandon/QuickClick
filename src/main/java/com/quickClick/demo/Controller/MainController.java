package com.quickClick.demo.Controller;

import com.quickClick.demo.Pojo.Product;
import com.quickClick.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Products")
public class MainController {

    @Autowired
    ProductService productService;

    @GetMapping("/students")
    public List<Product> getStudent(){
        return productService.getAllProducts();
    }


}
