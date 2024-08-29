package com.example.project2.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "hoadon")
public class HoaDon {

    public HoaDon(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhd")
    private Long idHD;

    @Column(name = "idnguoidung")
    private Long idNguoiDung;

    @Column(name = "ngaylap")
    private Date ngayLap;

    @Column(name = "tongtien")
    private Double tongTien;

    @Column(name = "soluong")
    private Integer soLuong;


    @JoinColumn(name = "idvoucher")
    private Integer idvoucher;


    @JoinColumn(name = "idkm")
    private Integer idkm;

    public HoaDon(Long idHD, Long idNguoiDung, Date ngayLap, Double tongTien, Integer soLuong, Integer idvoucher, Integer idkm) {
        this.idHD = idHD;
        this.idNguoiDung = idNguoiDung;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.soLuong = soLuong;
        this.idvoucher = idvoucher;
        this.idkm = idkm;
    }

    public Long getIdHD() {
        return idHD;
    }

    public void setIdHD(Long idHD) {
        this.idHD = idHD;
    }

    public Long getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(Long idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getIdvoucher() {
        return idvoucher;
    }

    public void setIdvoucher(Integer idvoucher) {
        this.idvoucher = idvoucher;
    }

    public Integer getIdkm() {
        return idkm;
    }

    public void setIdkm(Integer idkm) {
        this.idkm = idkm;
    }
}
