package com.c0d3engr.onlineshop.model.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity (name = "product_category")
public class Product_category_entity {
    private Integer id;
    private String name;
    private String desc;
    private Timestamp created_at;
    private Timestamp modified_at;
    private Timestamp deleted_at;
}