package com.konell.marketplace.core;

import com.konell.marketplace.domain.product.Product;
import com.konell.marketplace.dtos.ProductDTO;

import java.util.List;

public interface ProductUseCase {

    Product createProduct(ProductDTO product);

    List<Product> getAllProducts();
}
