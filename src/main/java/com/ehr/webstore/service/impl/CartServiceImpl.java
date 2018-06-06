package com.ehr.webstore.service.impl;

import com.ehr.webstore.domain.Cart;
import com.ehr.webstore.domain.repository.CartRepository;
import com.ehr.webstore.exception.InvalidCartException;
import com.ehr.webstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.create(cart);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.read(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {
        cartRepository.update(cartId, cart);
    }

    @Override
    public void delete(String cartId) {
        cartRepository.delete(cartId);
    }

    @Override
    public Cart validate(String cartId) {
        System.out.println("------------------------------------------");
        System.out.println("Jestem w CastServiceImpl.validate(cartId).");
        System.out.println("cartId = " + cartId);
        System.out.println("------------------------------------------");
        Cart cart = cartRepository.read(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            System.out.println("UWAGA! Bede rzucal wyjatkiem InvalidCharsException(cartId)!");
            System.out.println("gdzie cartId = \"" + cartId + "\"");
            throw new InvalidCartException(cartId);
        }
        return cart;
    }
}
