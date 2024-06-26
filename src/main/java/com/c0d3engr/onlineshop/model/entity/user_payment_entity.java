package com.c0d3engr.onlineshop.model.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User_payment_entity {
    private Integer id;
    private Integer user_id;
    private String payment_type;
    private String provider;
    private Integer account_no;
    private Date expiry;
}