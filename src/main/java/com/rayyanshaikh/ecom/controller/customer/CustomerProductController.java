package com.rayyanshaikh.ecom.controller.customer;

import com.rayyanshaikh.ecom.dto.ProductDto;
import com.rayyanshaikh.ecom.services.customer.CustomerProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CustomerProductController {
    @Autowired
    private final CustomerProductService customerProductService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> products = customerProductService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/search/{query}")
    public ResponseEntity<List<ProductDto>> getAllProductsByName(@PathVariable String query){
        List<ProductDto> products = customerProductService.searchProductByTitle(query);
        return ResponseEntity.ok(products);
    }
}
