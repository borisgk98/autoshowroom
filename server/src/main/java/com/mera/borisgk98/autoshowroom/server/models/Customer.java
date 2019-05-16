package com.mera.borisgk98.autoshowroom.server.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String name;
    protected String surname;

    @OneToMany(fetch = FetchType.LAZY)
    protected List<Order> orders;
}
