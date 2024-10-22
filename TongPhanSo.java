/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.Scanner;

class ClmPhanSo{
    private long tuso;
    private long mauso;
    ClmPhanSo(long tuso, long mauso)
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

/**
 *
 * @author adminbk
 */
public class TongPhanSo  {
    public static long gcd(long a, long b)
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b)
    {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClmPhanSo a = new ClmPhanSo(sc.nextLong(), sc.nextLong());
        ClmPhanSo b = new ClmPhanSo(sc.nextLong(), sc.nextLong());
        long bcnn = lcm(a.getMauSo(), b.getMauSo());
        long temp = a.getTuSo() * (bcnn / a.getMauSo()) + b.getTuSo() * (bcnn/b.getMauSo());
        long chung = gcd(bcnn, temp);
        System.out.println(temp/chung + "/" + bcnn/chung);
    }
}
