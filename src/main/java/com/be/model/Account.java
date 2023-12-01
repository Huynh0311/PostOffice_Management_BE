package com.be.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String name;
    @ManyToOne
    private Role role;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String avatar;
    private String frontIdCard;
    private String backIdCard;

    public Account(String username, String password, String avatar, Role role) {
        this.username = username;
        this.password = new BCryptPasswordEncoder().encode(password);
        this.avatar = avatar;
        this.role = role;
    }
}
