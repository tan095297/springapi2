package it.nvc.springapi.controller;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nvc.springapi.model.Product;
import it.nvc.springapi.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ResponseEntity<Object> getAllProduct(){
        List<Product> products = productService.getProducts();
        HashMap<String,Object> map = new HashMap<>();
        map.put("msg", "Search Success!");
        map.put("data", products);
        return new ResponseEntity<>(map,HttpStatus.OK);
    }
}
