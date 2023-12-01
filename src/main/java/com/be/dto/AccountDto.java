package com.be.dto;

import com.be.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Integer id;
    private String username;
    private String avatar;
    private Role role;
    private String token;
}
