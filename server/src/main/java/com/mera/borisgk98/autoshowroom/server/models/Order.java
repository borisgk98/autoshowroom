package com.mera.borisgk98.autoshowroom.server.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Setter
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected OrderStatus status;

    @ManyToOne
    protected Seller seller;
    @ManyToOne
    protected Customer customer;
    @OneToOne
    protected Auto auto;
}
