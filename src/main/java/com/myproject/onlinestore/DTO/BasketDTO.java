package com.myproject.onlinestore.DTO;

import com.myproject.onlinestore.model.Basket;
import com.myproject.onlinestore.model.Product;

import java.util.List;

public class BasketDTO {
    List<Basket> basket;

    public List<Basket> getBasket() {
        return basket;
    }

    public void setBasket(List<Basket> basket) {
        this.basket = basket;
    }

}
