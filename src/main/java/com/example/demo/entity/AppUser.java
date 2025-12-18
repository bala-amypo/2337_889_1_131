package com.example.demo.entity;

public class AppUser{
     private Long id;
     @Column(unique=true)
     private String email;
     private String password;
     private 
     private Boolean active;
}