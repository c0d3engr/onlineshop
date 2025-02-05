package com.c0d3engr.onlineshop.model.rest;

import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product_category {
    private Integer id;
    private String name;
    private String desc;
    private Timestamp created_at;
    private Timestamp modified_at;
    private Timestamp deleted_at;
}
