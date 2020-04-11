package com.myproject.onlinestore.service;

import com.myproject.onlinestore.DTO.BasketDTO;
import com.myproject.onlinestore.model.Basket;
import com.myproject.onlinestore.model.Product;
import com.myproject.onlinestore.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    @Autowired
    BasketRepository basketRepository;

    public List<Basket> saveAll(BasketDTO basketDTO){

        try {
            return basketRepository.saveAll(basketDTO.getBasket());
        }catch(DataIntegrityViolationException e){
            return null;
        }
    }

}
