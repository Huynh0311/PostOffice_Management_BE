package com.be.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Shipper shipper;
    @ManyToOne
    private Orders orders;
    private LocalDate deliveryTime;
    private String status;
}
