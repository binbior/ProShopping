package com.example.project_final_2.dto.user;

import com.example.project_final_2.entity.product.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;

    private String fullName;

    private Date dOB;

    private String gender;

    private String identityCard;

    private String email;

    private String address;

    private String phoneNumber;

    private String password;

    List<Image> images;

}
