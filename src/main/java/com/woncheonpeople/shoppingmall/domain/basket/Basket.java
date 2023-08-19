package com.woncheonpeople.shoppingmall.domain.basket;

import com.woncheonpeople.shoppingmall.domain.basket_product.Basket_product;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int count; // 장바구니에 담긴 상품 개수

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="member_id")
    Member member;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Basket_product> basket_items = new ArrayList<>();

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate createDate; // 날짜

    @PrePersist
    public void createDate(){
        this.createDate = LocalDate.now();
    }

    public static Basket createBasket(Member member){
        Basket basket = new Basket();
        basket.user = user;
        basket.count = 0;

        return basket;
    }