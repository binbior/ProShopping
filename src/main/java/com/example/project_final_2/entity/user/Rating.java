package com.example.project_final_2.entity.user;

import com.example.project_final_2.entity.product.Product;
<<<<<<< HEAD
import com.example.project_final_2.entity.product.UserProductKey;
=======
>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0

@Entity
@Getter
@Setter
@Table(name = "rating")
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
public class Rating implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserProductKey userProductKey;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
=======
public class Rating {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userId")
>>>>>>> 1d8aa45aee33f116563cf7d6d5d8f2fdba87d6f0
    private User user;

    @Column(name = "comment")
    private String comment;

    @Column(name = "score")
    private int score;
}
