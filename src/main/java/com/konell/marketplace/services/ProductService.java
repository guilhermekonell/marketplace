package com.konell.marketplace.services;

import com.konell.marketplace.core.ProductUseCase;
import com.konell.marketplace.domain.product.Product;
import com.konell.marketplace.dtos.ProductDTO;
import com.konell.marketplace.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductUseCase {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductDTO productDTO) {
        Product product = new Product(productDTO);
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
