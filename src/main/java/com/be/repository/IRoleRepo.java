package com.be.repository;

import com.be.model.Orders;
import com.be.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepo extends JpaRepository<Role, Integer> {

}
