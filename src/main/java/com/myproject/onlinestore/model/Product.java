package com.myproject.onlinestore.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;


@Entity
public class Product {
    @Id
    Integer id;
    String name;
    String type;

    public Product() {
    }

    public Product(Integer id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type= type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
