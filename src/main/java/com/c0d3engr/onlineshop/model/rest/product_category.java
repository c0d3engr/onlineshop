package com.c0d3engr.onlineshop.model.rest;

import java.security.Timestamp;

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
