package com.example.project2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "hoadonchitiet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class hoadonchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idHD")
    private Integer idHD;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "gia")
    private BigDecimal gia;

    @Column(name = "idSPCT")
    private Integer idSPCT;
}
