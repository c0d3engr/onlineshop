package com.c0d3engr.onlineshop.model.entity;

import java.math.BigDecimal;
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
@Entity (name = "order_details")
public class Order_details_entity {
    private Integer id;
    private String user_id;
    private BigDecimal total;
    private Integer payment_id;
    private Timestamp created_at;
    private Timestamp modified_at;
}
