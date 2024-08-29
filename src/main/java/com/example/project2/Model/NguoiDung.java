package com.example.project2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "NguoiDung")
@AllArgsConstructor
@NoArgsConstructor
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNguoiDung")
    private Integer idND;
    @Column(name = "ten")
    private String tenND;
    @Column (name="diaChi")
    private String diaChi;
    @Column(name = "sdt")
    private Integer soDienThoai;
    @Column(name = "email")
    private String email;
    @Column(name = "ngaySinh")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @Column(name = "matKhau")
    private String matKhau;


}
