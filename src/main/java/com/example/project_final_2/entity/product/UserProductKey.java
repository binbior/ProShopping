package com.example.project_final_2.entity.product;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class UserProductKey implements Serializable {

    @Column(name = "userId")
    private Long userId;

    @Column(name = "productId")
    private Long productId;
}
