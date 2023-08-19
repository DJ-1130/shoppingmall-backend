package com.woncheonpeople.shoppingmall.domain.product;

import com.woncheonpeople.shoppingmall.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<Product, Long> {
    Product findProductBy(Long productId);
}
