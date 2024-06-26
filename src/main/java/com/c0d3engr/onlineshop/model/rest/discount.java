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
public class Discount {
    private Integer id;
    private String name;
    private String desc;
    private Float discount_percent;
    private Boolean active;
    private Timestamp created_at;
    private Timestamp modified_at;
    private Timestamp deleted_at;
}
