package com.example.project2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sanphamchitiet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class sanphamchitiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSPCT")
    private Integer idSPCT;

    @Column(name = "idTH")
    private Integer idTH;

    @Column(name = "idSize")
    private Integer idSize;

    @Column(name = "idMau")
    private Integer idMau;

    @Column(name = "soluong")
    private String soluong;

    @Column(name = "gia")
    private BigDecimal gia;

    @Column(name = "mota")
    private String mota;

    @Column(name = "hinhanh")
    private String hinhanh;

    @Column(name = "ngaythem")
    private Date ngaythem;

    @Column(name = "tensp")
    private String tensp;
}
