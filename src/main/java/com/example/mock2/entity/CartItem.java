package com.example.mock2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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
