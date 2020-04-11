package com.myproject.onlinestore.service;

import com.myproject.onlinestore.DTO.ProductDTO;
import com.myproject.onlinestore.model.Product;
import com.myproject.onlinestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;


    public List<Product> findByNameLikeAndType(String name,String type){
        return productRepository.findByNameLikeAndType(name,type);
    }

    public List<Product> findByNameLike(String name){
        return productRepository.findByNameLike(name);
    }

    public List<Product> findByUserIdInBasket(Integer id){
        return productRepository.findByUserIdInBasket(id);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public List<Product> saveAll(ProductDTO productDTO){
        return productRepository.saveAll(productDTO.getProducts());
    }

}
