package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*; // This imports Data, Builder, etc.

@Entity
@Table(name = "users")
@Data                 // Fixes getEmail(), getPassword(), getRole(), etc.
@Builder              // Fixes .builder() errors
@NoArgsConstructor    // Fixes "constructor cannot be applied to given types"
@AllArgsConstructor   // Allows @Builder to work with @NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String role;
}