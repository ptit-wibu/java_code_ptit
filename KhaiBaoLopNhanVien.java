/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
class NiVi{
    private String ma;
    private String ten;
    private String gtinh;
    private Date nsinh;
    private String dchi;
    private String msothue;
    private Date hopdong;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public NiVi( String ten, String gtinh, Date nsinh, String dchi, String msothue, Date hopdong)
    {
        this.ma = "00001";
        this.ten = ten;
        this.gtinh = gtinh;
        this.nsinh = nsinh;
        this.dchi = dchi;
        this.msothue = msothue;
        this.hopdong = hopdong;
    }
    public String toString()
    {
        return ma + " " +ten + " " + gtinh + " " +sdf.format(nsinh) + " " + dchi + " " + msothue + " " + sdf.format(hopdong);
    }
}
/**
 *
 * @author adminbk
 */
public class KhaiBaoLopNhanVien {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        NiVi a = new NiVi(sc.nextLine(), sc.nextLine(), date.parse(sc.nextLine()), sc.nextLine(), sc.nextLine(), date.parse(sc.nextLine()));
        System.out.println(a);
    }
}
