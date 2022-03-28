package com.example.project_final_2.entity.user;

import com.example.project_final_2.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "rating")
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "comment")
    private String comment;

    @Column(name = "score")
    private int score;
}
