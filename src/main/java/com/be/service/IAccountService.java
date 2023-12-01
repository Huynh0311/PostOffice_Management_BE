package com.be.service;

import com.be.model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAccountService extends UserDetailsService {
    Account createAccount(Account account);
    Account findByUsernameAndPassword(String username, String password);
    Account findByUsername(String username);
}
