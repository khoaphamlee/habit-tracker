package com.khoapham.habit_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    // Constructors
    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
