package com.serot.budbut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String loginID;

    @NotEmpty
    private String password;

    @Email
    private String email;

    @Column(name = "nickname", nullable = false, length = 100)
    private String nickname;
}
