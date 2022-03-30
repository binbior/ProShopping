package com.example.project_final_2.dto.reponse;

import com.example.project_final_2.dto.enums.ViewMode;
import com.example.project_final_2.entity.product.Category;
import com.example.project_final_2.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {

    private long id;
    private int availiableQuantity;
    private String manufacturedFactory;
    private int maxQuantity;
    private String productName;
    private int price;
    private float ratingScore;
    private String origin;
    private Category category;
    private List imageDTOs;
    private List categoryDTOs;
    private static ModelMapper modelMapper = new ModelMapper();

    public static void setModelMapper(){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

//    public static ProductResponseDTO getDTOFrom(Product product, ViewMode mode){
//        ProductResponseDTO productResponseDTO = modelMapper.map(product,ProductResponseDTO.class);
//    }

}
