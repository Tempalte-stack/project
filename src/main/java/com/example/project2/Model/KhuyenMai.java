package com.example.project2.Model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "khuyenmai")
public class KhuyenMai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkm")
    private Long idKM;

    @Column(name = "tenkhuyenmai")
    private String tenKhuyenMai;

    @Column(name = "giatrikhuyenmai")
    private Double giaTriKhuyenMai;

    @Column(name = "ngaybatdau")
    private Date ngayBatDau;

    @Column(name = "ngayketthuc")
    private Date ngayKetThuc;

    @Column(name = "trangthai")
    private String trangThai;

    public KhuyenMai(){}

    public KhuyenMai(Long idKM, String tenKhuyenMai, Double giaTriKhuyenMai, Date ngayBatDau, Date ngayKetThuc, String trangThai) {
        this.idKM = idKM;
        this.tenKhuyenMai = tenKhuyenMai;
        this.giaTriKhuyenMai = giaTriKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public Long getIdKM() {
        return idKM;
    }

    public void setIdKM(Long idKM) {
        this.idKM = idKM;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public Double getGiaTriKhuyenMai() {
        return giaTriKhuyenMai;
    }

    public void setGiaTriKhuyenMai(Double giaTriKhuyenMai) {
        this.giaTriKhuyenMai = giaTriKhuyenMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
