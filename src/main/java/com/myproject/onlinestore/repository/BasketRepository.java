package com.myproject.onlinestore.repository;

import com.myproject.onlinestore.model.Basket;
import com.myproject.onlinestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BasketRepository extends JpaRepository<Basket, Integer> {

}
