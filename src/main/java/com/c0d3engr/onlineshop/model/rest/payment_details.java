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
public class Payment_details {
    private Integer id;
    private Integer order_id;
    private BigDecimal amount;
    private String provider;
    private String status;
    private Timestamp created_at;
    private Timestamp modified_at;
}
