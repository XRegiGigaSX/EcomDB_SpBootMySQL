package com.rayyanshaikh.ecom.services.customer.cart;

import com.rayyanshaikh.ecom.dto.AddProductInCartDto;
import com.rayyanshaikh.ecom.dto.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);

    OrderDto getCartByUserId(Long userId);
}
