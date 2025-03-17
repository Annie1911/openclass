package com.example.openclass.model;




import jakarta.persistence.CascadeType;

import java.util.List;

import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    @Column(nullable =false)
    private Role role;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;

    @OneToMany(mappedBy="user" ,cascade = CascadeType.ALL)
    private List<Book> books;




}