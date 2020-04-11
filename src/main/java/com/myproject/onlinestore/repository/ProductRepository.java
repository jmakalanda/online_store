package com.myproject.onlinestore.repository;

import com.myproject.onlinestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT P FROM Product P WHERE P.name like %?1% AND P.type = ?2")
    List<Product> findByNameLikeAndType(String name, String type);

    @Query("SELECT P FROM Product P WHERE P.name like %?1%")
    List<Product> findByNameLike(String name);

    @Query("SELECT P FROM Product P, Basket B WHERE B.productId = P.id and B.userId = ?1")
    List<Product> findByUserIdInBasket(Integer id);

}
