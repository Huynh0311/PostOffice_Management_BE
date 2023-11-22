package com.be.repository;

import com.be.model.Account;
import com.be.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeliveryRepo extends JpaRepository<Delivery, Integer> {

}
