package com.c0d3engr.onlineshop.model.entity;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity (name = "user")
public class User_entity {
    
    @Id // Sets id as the primary key.
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Sets field to autoincremental.
    private Integer id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private Integer telephone;
    private Timestamp created_at;
    private Timestamp modified_at;

    @ManyToOne(fetch = FetchType.LAZY) // I don't fully understand this part yet.
    @JoinColumn(name="category_id") // I don't fully understand this part yet.
    private User_entity user_entity; // This needs correction. 

}