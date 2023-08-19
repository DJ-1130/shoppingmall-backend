package com.woncheonpeople.shoppingmall.domain.basket;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {
    Basket findBasketBy(int memberId);


}
