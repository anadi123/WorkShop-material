package com.mphasis.springboot.entpapp.Controllers;

import com.mphasis.springboot.entpapp.models.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @RequestMapping("/products")
    public List<Products> getProducts(){
        return Arrays.asList(new Products(1,"Pencil",10.0),
                new Products(1,"Eraser",5.0),
                new Products(1,"pen",6.0));
    }
}
