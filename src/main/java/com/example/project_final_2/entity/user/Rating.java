package com.example.project_final_2.entity.user;

import com.example.project_final_2.entity.product.Product;
import com.example.project_final_2.entity.product.UserProductKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "rating")
@AllArgsConstructor
@NoArgsConstructor
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
    private User user;

    @Column(name = "comment")
    private String comment;

    @Column(name = "score")
    private int score;
}
