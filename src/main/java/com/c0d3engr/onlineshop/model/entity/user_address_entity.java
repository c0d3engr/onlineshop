package com.c0d3engr.onlineshop.model.entity;

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
@Entity (name = "user_address")
public class User_address_entity {
    @Id // Sets id as the primary key.
    @GeneratedValue (strategy = GenerationType.IDENTITY) // Sets field to autoincremental.
    private Integer id;
    private String user_id;
    private String address_line1;
    private String address_line2;
    private String city;
    private Integer postal_code;
    private String country;
    private Integer telephone;
    private Integer mobile;

    @ManyToOne(fetch = FetchType.LAZY) // I don't fully understand this part yet.
    @JoinColumn(name="category_id") // I don't fully understand this part yet.
    private User_entity user_entity;
}

