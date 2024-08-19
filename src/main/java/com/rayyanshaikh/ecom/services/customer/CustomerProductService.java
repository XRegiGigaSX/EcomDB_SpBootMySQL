package com.rayyanshaikh.ecom.services.customer;

import com.rayyanshaikh.ecom.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {
    List<ProductDto> getAllProducts();

    List<ProductDto> searchProductByTitle(String query);
}
