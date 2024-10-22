package com.mycompany.codeptit;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.io.*;

class SiVi{
    private String name;
    private String lop;
    private Date born;
    private double gpa;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private DecimalFormat df = new DecimalFormat("0.00");
    public SiVi(String name, String lop, Date born, double gpa)
    {
        this.name = name;
        this.lop = lop;
        this.born = born; 
        this.gpa = gpa;
    }
    public String getName(){
        return this.name;
    }
    public String getLop()
    {
        return this.lop;
    }
    public String getBorn()
    {
        return sdf.format(born);
    }
    public String getGpa()
    {
        return df.format(gpa);
    }
    /*public String toStirng()
    {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name + " " + this.lop +" "+ date.format(born)+" "+df.format(gpa);
    }*/
}
public class KhaiBaoLopSinhVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SiVi a = new SiVi(sc.nextLine(), sc.nextLine(), sdf.parse(sc.nextLine()), sc.nextDouble());
        //System.out.println(a.getName());
        System.out.println("B20DCCN001" + " " + a.getName() + " " + a.getLop() +" " + a.getBorn() + " " + a.getGpa());
    }
}
