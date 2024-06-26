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
@Entity (name = "order_items")
public class Order_items_entity {
    private Integer id;
    private Integer order_id;
    private Integer product_id;
    private Integer quantity;
    private Timestamp created_at;
    private Timestamp modified_at;
}
