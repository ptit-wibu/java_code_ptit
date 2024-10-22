/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
import java.io.*;
/**
 *
 * @author adminbk
 */

class Stu{
    private static int cnt=1;
    private String ma;
    private String ten;
    private String lop;
    private Date born;
    private double gpa;

    public String getMa() {
        return ma;
    }

    public void setMa() {
        this.ma = String.format("B20DCCN%03d",cnt++ );
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("0.00");
        return ma + " " + ten + " " + lop + " " + sdf.format(born) + " " + df.format(gpa);
    }
}
public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        ArrayList<Stu> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0)
        {
            Stu a = new Stu();
            a.setMa();
            sc.nextLine();
            a.setTen(sc.nextLine());
            a.setLop(sc.nextLine());
            a.setBorn(sdf.parse(sc.nextLine()));
            a.setGpa(sc.nextDouble());
            list.add(a);
        }
        for(Stu x:list)
        {
            System.out.println(x);
        }
    }
}
