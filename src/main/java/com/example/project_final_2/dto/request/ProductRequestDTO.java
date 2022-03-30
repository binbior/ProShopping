package com.example.project_final_2.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDTO {
    private String productName;
    private int price;
    private int maxQuantity;
    private int availiableQuantity;
    private String manufacturedFactory;
    private String origin;
    private int ratingScore;
}
