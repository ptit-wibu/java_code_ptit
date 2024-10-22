/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.lang.*;
/**
 *
 * @author adminbk
 */
class DemoPhanSo{
    private long tuso;
    private long mauso;
    DemoPhanSo(long tuso, long mauso)
    {
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public long getMauSo()
    {
        return this.mauso;
    }
    public long getTuSo()
    {
        return this.tuso;
    }
}

public class PhanSo {
    public static long gcd(long a, long b)
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DemoPhanSo tmp = new DemoPhanSo(sc.nextLong(), sc.nextLong());
        long tuso = tmp.getTuSo();
        long mauso = tmp.getMauSo();
        long ucln = gcd(tuso, mauso);
        System.out.println(tuso/ucln + "/" + mauso/ucln);
    }
}
