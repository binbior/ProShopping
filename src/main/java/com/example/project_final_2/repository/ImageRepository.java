package com.example.project_final_2.repository;

import com.example.project_final_2.entity.product.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
