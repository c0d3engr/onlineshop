package com.c0d3engr.onlineshop.model.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Shopping_session_entity {
    
    private Integer id;
    private String user_id;
    private BigDecimal total;
    private Timestamp created_at;
    private Timestamp modified_at;
}