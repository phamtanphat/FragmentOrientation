package com.ptp.phamtanphat.fragmentorientation;

/**
 * Created by KhoaPhamPC on 9/4/2018.
 */

public class Nhanvien {
    private String Ten;
    private String Diachi;
    private String Namsinh;

    public Nhanvien(String ten, String diachi, String namsinh) {
        Ten = ten;
        Diachi = diachi;
        Namsinh = namsinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String namsinh) {
        Namsinh = namsinh;
    }
}
