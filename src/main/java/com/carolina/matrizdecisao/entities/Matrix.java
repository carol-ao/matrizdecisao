package com.carolina.matrizdecisao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Matrix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Criteria> criteria = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Option> options = new HashSet<>();

}
