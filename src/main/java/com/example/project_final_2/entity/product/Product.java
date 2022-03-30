package com.example.project_final_2.entity.product;

import com.example.project_final_2.entity.cart.CartItem;
import com.example.project_final_2.entity.invoice.InvoiceItems;
import com.example.project_final_2.entity.user.Rating;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
<<<<<<< HEAD
    private long id;
=======
    private Long id;
>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0

    @Column(name = "instock")
    private int availiableQuantity;

    @Column(name = "manufacturedFactory")
    private String manufacturedFactory;

    @Column(name = "maxQuantity")
    private int maxQuantity;

    @Column(name = "productName")
    private String productName;

    @Column(name = "price")
    private int price;

    @Column(name = "ratingScore")
<<<<<<< HEAD
    private float ratingScore;
=======
    private int ratingScore;
>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0

    @Column(name = "origin")
    private String origin;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Image> images;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
<<<<<<< HEAD
    private Set<CartItem> cart_item;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<InvoiceItems> invoice_items;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Rating> ratings;

=======
    @JsonIgnore
    private Set<CartItem> cart_item;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @JsonIgnore
    private Set<InvoiceItems> invoice_items;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @JsonIgnore
    private List<Rating> ratings;


>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    @JsonIgnore
//    private

}
