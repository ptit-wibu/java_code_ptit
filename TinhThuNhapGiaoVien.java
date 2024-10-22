/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
class GV {
    private String ma;
    private String ten;
    private long luong;

    public GV(String ma, String ten, long luong)
    {
        this.ma = ma;
        this.ten = ten;
        this.luong = luong;
    }
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getLuong() {
        return (int) luong;
    }

    @Override
    public String toString() {
        String chucvu = ma.substring(0,2);
        int heso =  Integer.parseInt(ma.substring(2));
        if(chucvu.equals("HT"))  return ma + " " + ten + " " + String.valueOf(heso) + " " + "2000000" + " " + String.valueOf((long)(heso * luong + 2000000));
        else if (chucvu.equals("HP")) return ma + " " + ten + " " + String.valueOf(heso) + " " + "900000" + " " + String.valueOf((long)(heso * luong + 900000));
        return ma + " " + ten + " " + String.valueOf(heso) + " " + "500000" + " " + String.valueOf((long)(heso * luong + 500000));
    }
    
}
/**
 *
 * @author adminbk
 */
public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GV a = new GV(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(a);
    }
}
