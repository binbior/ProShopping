package com.example.project_final_2.entity.cart;

import com.example.project_final_2.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "cart_item")
public class CartItem {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "cartId", nullable=false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "itemId", nullable=false)
    private Product product;


}
