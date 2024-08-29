package com.example.project2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "thuonghieu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class thuonghieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idthuonghieu")
    private Integer idthuonghieu;

    @Column(name = "tenthuonghieu")
    private String tenthuonghieu;
}
