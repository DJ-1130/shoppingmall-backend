package com.woncheonpeople.shoppingmall.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;



@AllArgsConstructor // Parameter 로 모든 변수를 받는 생성자
@NoArgsConstructor // Parameter 가 없는 생성자
@Entity//Jpa에서 관리하는 클래스로 테이블과 자동매핑
@Data //Lombok을 이용하여 해당 필드의 getter,setter 자동 생성
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId; //상품 고유번호
    private String productName; // 상품 이름
    private int price;// 상품 가격
    private int stock;// 상품 재고
    private boolean isSoldout(); // 상품 판매여부
    private int count;// 팔린 갯수
    private String text;
    private String filename;
    private String filepath;



}
