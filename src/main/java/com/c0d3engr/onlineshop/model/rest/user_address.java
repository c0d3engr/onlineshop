package com.c0d3engr.onlineshop.model.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User_address {
    private Integer id;
    private String user_id;
    private String address_line1;
    private String address_line2;
    private String city;
    private Integer postal_code;
    private String country;
    private Integer telephone;
    private Integer mobile;
}
