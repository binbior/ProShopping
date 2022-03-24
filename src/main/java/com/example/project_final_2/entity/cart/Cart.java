package com.example.project_final_2.entity.cart;

import com.example.project_final_2.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartId")
    private long cartId;

    @Column(name = "totalMoney")
    private double totalMoney;

    @OneToMany(mappedBy="cart")
    private Set<CartItem> cart_item;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;
}
