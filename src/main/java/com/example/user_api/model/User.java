package com.example.user_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Country country;

    // Getters and setters
}