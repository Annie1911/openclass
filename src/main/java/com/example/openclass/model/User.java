package com.example.openclass.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;


@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String Username;

    @Column(nullable = false,unique = true)
    @Email(message = "Please provide a valid email")
    private String email;

    @Column(nullable = false,unique = true)
    @Size(min = 6,message = "Password must be at least 6 characters long")
    @NotBlank(message = "Password is required")
    private String password;

    private int age;

}