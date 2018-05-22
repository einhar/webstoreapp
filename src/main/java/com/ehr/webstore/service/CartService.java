package com.ehr.webstore.service;

import com.ehr.webstore.domain.Cart;

public interface CartService {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);
}
