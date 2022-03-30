package com.example.project_final_2.repository;

import com.example.mock2.entity.CartItem;
import com.example.project_final_2.entity.product.UserProductKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepostiory extends JpaRepository<CartItem, UserProductKey> {

}
