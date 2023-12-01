package com.be.service.impl;

import com.be.model.Account;
import com.be.model.Role;
import com.be.repository.IAccountRepo;
import com.be.repository.IRoleRepo;
import com.be.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepo iAccountRepo;
    @Autowired
    private IRoleRepo iRoleRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = iAccountRepo.findByUsername(username);
        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(account.getRole());
        return new User(account.getUsername(),account.getPassword(),roles);
    }

    @Override
    public Account createAccount(Account account) {
        account.setPassword(encodePassword(account.getPassword()));
        Role role = iRoleRepo.findByName("ROLE_USER");
        account.setRole(role);
        return iAccountRepo.save(account);
    }

    @Override
    public Account findByUsernameAndPassword(String username, String password) {
        return iAccountRepo.findByUsernameAndPassword(username, password);
    }

    @Override
    public Account findByUsername(String username) {
        return iAccountRepo.findByUsername(username);
    }

    private String encodePassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
}
