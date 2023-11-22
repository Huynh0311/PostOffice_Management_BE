package com.be.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCustomer;
    private Double weight;
    private String detailAddress;
    private String ward;
    private String district;
    private String city;
    private String status;
}
