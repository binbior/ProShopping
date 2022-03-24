package com.example.project_final_2.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "availiableQuantity")
    private Integer availiableQuantity;

    @Column(name = "availiableQuantity")
    private String manufacturedFactory;

    @Column(name = "availiableQuantity")
    private Integer maxQuantity;

    @Column(name = "availiableQuantity")
    private String nameProduct;

    @Column(name = "availiableQuantity")
    private Integer price;

    @Column(name = "availiableQuantity")
    private Integer ratingScore;

    @Column(name = "availiableQuantity")
    private String origin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    @JsonIgnore
    private List<Image> images;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    @JsonIgnore
//    private

}
