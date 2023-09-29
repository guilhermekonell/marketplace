package com.konell.marketplace.controllers;

import com.konell.marketplace.domain.product.Product;
import com.konell.marketplace.dtos.ProductDTO;
import com.konell.marketplace.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    private ResponseEntity<Product> createProduct(@RequestBody ProductDTO productDTO) {
        Product product = productService.createProduct(productDTO);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
