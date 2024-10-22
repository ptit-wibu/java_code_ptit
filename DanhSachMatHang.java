/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import javax.crypto.AEADBadTagException;
/**
 *
 * @author adminbk
 */
class Things implements Comparable<Things>
{
    private static int cnt = 0;
    private String ma;
    private String ten;
    private String donvi;
    private int inner;
    private int outer;

    public String getMa() {
        return ma;
    }

    public void setMa() {
        this.ma = String.format("MH%03d", ++cnt);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public int getInner() {
        return inner;
    }

    public void setInner(int inner) {
        this.inner = inner;
    }

    public int getOuter() {
        return outer;
    }

    public void setOuter(int outer) {
        this.outer = outer;
    }

    @Override
    public String toString() {
       return ma + " " + ten +" " + donvi +" " + String.valueOf(inner) + " " + String.valueOf(outer) + " " + String.valueOf(outer - inner);
    }
    public int compareTo(Things other)
    {
        if((this.outer - this.inner) != (other.outer - other.inner)) return -((this.outer - this.inner) - (other.outer - other.inner));
        return this.ma.compareTo(other.ma);
    }
}
public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Things> list = new ArrayList<>();
        while(t-->0)
        {
            Things a = new Things();
            a.setMa();
            sc.nextLine();
            a.setTen(sc.nextLine());
            a.setDonvi(sc.nextLine());
            a.setInner(sc.nextInt());
            a.setOuter(sc.nextInt());
            list.add(a);
        }
        Collections.sort(list);
        for(Things x:list)
        {
            System.out.println(x);
        }
    }
}
