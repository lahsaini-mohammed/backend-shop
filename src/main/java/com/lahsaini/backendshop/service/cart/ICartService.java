package com.lahsaini.backendshop.service.cart;

import com.lahsaini.backendshop.dto.CartDto;
import com.lahsaini.backendshop.model.Cart;
import com.lahsaini.backendshop.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);

    CartDto convertToDto(Cart cart);
}