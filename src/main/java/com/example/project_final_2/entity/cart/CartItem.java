package com.example.project_final_2.entity.cart;

import com.example.project_final_2.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "cart_item")
public class CartItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name = "cartId", nullable=false)
    private Cart cart;

    @Id
    @ManyToOne
    @JoinColumn(name = "itemId", nullable=false)
    private Product product;

    @Column(name = "numberItem")
    private Integer number;

}
