package com.myproject.onlinestore.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer id;
    Integer productId;
    Integer userId;

    public Basket(Integer productId, Integer userId) {
        this.productId = productId;
        this.userId = userId;
    }

    public Basket(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
