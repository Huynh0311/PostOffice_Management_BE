package com.be.repository;

import com.be.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepo extends JpaRepository<Account, Integer> {
    Account findByUsername(String name);
    Account findByUsernameAndPassword(String username, String password);
}
