package com.example.project2.Model;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Table(name = "NguoiDung")
@Setter
@Getter
@Controller

public class NguoiDung {
    private int IDNguoiDung;
    private String HoTen;
    private Date NgaySinh;
    private int SDT;
    private String DiaChi;
    private String Email;
    private String MatKhau;

    public NguoiDung() {
    }

    public NguoiDung(int IDNguoiDung, String hoTen, Date ngaySinh, int SDT, String diaChi, String email, String matKhau) {
        this.IDNguoiDung = IDNguoiDung;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        this.SDT = SDT;
        DiaChi = diaChi;
        Email = email;
        MatKhau = matKhau;
    }

    public void setIDNguoiDung(int IDNguoiDung) {
        this.IDNguoiDung = IDNguoiDung;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "IDNguoiDung=" + IDNguoiDung +
                ", HoTen='" + HoTen + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", SDT=" + SDT +
                ", DiaChi='" + DiaChi + '\'' +
                ", Email='" + Email + '\'' +
                ", MatKhau='" + MatKhau + '\'' +
                '}';
    }
}
