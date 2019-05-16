package com.mera.borisgk98.autoshowroom.server.models1;

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
public class AutoOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String name;

    @ManyToMany(fetch = FetchType.LAZY)
    protected List<Auto> autos;
}
