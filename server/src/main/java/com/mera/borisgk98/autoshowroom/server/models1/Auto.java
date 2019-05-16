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
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    protected AutoMark mark;
    @ManyToOne
    protected AutoModel model;
    @ManyToMany(fetch = FetchType.LAZY)
    protected List<AutoOption> options;
}
