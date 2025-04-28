package com.serot.budbut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @Email
    private String email;

    @NotEmpty
    private String nickname;
}
