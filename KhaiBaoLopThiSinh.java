/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
/**
 *
 * @author adminbk
 */
class SV {
    private String ten;
    private Date date;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private double a,b,c;
    private double tong;
    SV(String ten, Date date, double a, double b, double c)
    {
        this.ten = ten;
        this.date = date;
        this.a = a; 
        this.b = b;
        this.c = c;
        this.tong = a + b + c;
    }
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("0.0");
        return this.ten + " " + sdf.format(date) + " " + df.format(tong);
    }
}
public class KhaiBaoLopThiSinh {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SV a = new SV(sc.nextLine(), date.parse(sc.nextLine()), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(a);
    }
}
