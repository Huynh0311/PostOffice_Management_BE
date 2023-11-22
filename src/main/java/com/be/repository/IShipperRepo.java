package com.be.repository;

import com.be.model.Role;
import com.be.model.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShipperRepo extends JpaRepository<Shipper, Integer> {

}
