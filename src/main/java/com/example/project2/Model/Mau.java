package com.example.project2.Model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Mau")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmau")
    private Integer idmau;

    @Column(name = "tenmau")
    private String tenmau;
}
