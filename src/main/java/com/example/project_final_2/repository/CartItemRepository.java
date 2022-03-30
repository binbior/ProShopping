package com.example.project_final_2.repository;

import com.example.mock2.entity.CartItem;
import com.example.project_final_2.entity.product.UserProductKey;
import com.example.project_final_2.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

public interface CartItemRepository extends JpaRepository<CartItem, UserProductKey> {

    @Transactional
    void deleteAllByUser(User user);
}
