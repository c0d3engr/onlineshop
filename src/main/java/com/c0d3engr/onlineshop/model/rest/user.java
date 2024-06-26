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
public class User {
    
    private Integer id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private Integer telephone;
    private Timestamp created_at;
    private Timestamp modified_at;
   
}
