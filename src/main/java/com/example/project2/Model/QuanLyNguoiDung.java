package com.example.project2.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuanLyNguoiDung {
    private int IDNguoiDung;
    private int IDQuyen;

    public QuanLyNguoiDung() {
    }

    public QuanLyNguoiDung(int IDNguoiDung, int IDQuyen) {
        this.IDNguoiDung = IDNguoiDung;
        this.IDQuyen = IDQuyen;
    }

    public int getIDNguoiDung() {
        return IDNguoiDung;
    }

    public void setIDNguoiDung(int IDNguoiDung) {
        this.IDNguoiDung = IDNguoiDung;
    }

    public int getIDQuyen() {
        return IDQuyen;
    }

    public void setIDQuyen(int IDQuyen) {
        this.IDQuyen = IDQuyen;
    }
}
