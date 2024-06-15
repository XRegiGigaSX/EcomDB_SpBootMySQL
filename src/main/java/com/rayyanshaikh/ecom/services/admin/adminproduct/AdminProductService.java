package com.rayyanshaikh.ecom.services.admin.adminproduct;

import com.rayyanshaikh.ecom.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {

    ProductDto addProduct(ProductDto productDto) throws IOException;

    List<ProductDto> getAllProducts();
}
