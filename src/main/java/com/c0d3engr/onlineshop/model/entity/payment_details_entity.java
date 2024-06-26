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
@Entity (name = "payment_details")
public class Payment_details_entity {
    private Integer id;
    private Integer order_id;
    private BigDecimal amount;
    private String provider;
    private String status;
    private Timestamp created_at;
    private Timestamp modified_at;
}