package com.plygrnd.produc.service.controller;

import com.plygrnd.produc.service.model.Product;
import com.plygrnd.produc.service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product) {
        log.info("Inside createProduct method of ProductController");
        productRepository.save(product);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProduct(){
        log.info("Inside getAllProduct method of ProductController");
        return productRepository.findAll();
    }
}
