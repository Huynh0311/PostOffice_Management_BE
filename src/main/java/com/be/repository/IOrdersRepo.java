package com.be.repository;

import com.be.model.Delivery;
import com.be.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepo extends JpaRepository<Orders, Integer> {

}
