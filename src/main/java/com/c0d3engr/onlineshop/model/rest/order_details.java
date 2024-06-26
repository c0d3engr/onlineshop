package com.c0d3engr.onlineshop.model.rest;

import java.math.BigDecimal;
import java.security.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Order_details {
    private Integer id;
    private String user_id;
    private BigDecimal total;
    private Integer payment_id;
    private Timestamp created_at;
    private Timestamp modified_at;
}
