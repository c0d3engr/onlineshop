package com.c0d3engr.onlineshop.model.rest;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product_inventory {
    private Integer id;
    private Integer quantity;
    private Timestamp created_at;
    private Timestamp modified_at;
    private Timestamp deleted_at;
}
