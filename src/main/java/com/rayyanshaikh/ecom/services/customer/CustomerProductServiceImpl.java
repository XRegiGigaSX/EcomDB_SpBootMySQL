package com.rayyanshaikh.ecom.services.customer;

import com.rayyanshaikh.ecom.dto.ProductDto;
import com.rayyanshaikh.ecom.entity.Product;
import com.rayyanshaikh.ecom.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerProductServiceImpl implements CustomerProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }

    public List<ProductDto> searchProductByTitle(String query){
        List<Product> products = productRepository.findAllByNameContaining(query);
        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }
}
