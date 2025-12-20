package com.example.demo.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Builder // Fixes builder()
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String role;
    private boolean active;
}