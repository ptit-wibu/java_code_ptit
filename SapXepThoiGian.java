/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
class Times implements Comparable<Times>
{
    private int gio;
    private int phut;
    private int giay;

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    @Override
    public String toString()
    {
        return String.valueOf(gio) + " " + String.valueOf(phut) + " " + String.valueOf(giay);
    } 
    @Override
    public int compareTo(Times other)
    {
        if(this.gio != other.gio) return this.gio - other.gio;
        if(this.phut != other.phut) return this.phut - other.phut;
        return this.giay - other.giay;
    }
}
/**
 *
 * @author adminbk
 */
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Times> list = new ArrayList<>();
        while(t-->0)
        {
            Times a = new Times();
            a.setGio(sc.nextInt());
            a.setPhut(sc.nextInt());
            a.setGiay(sc.nextInt());
            list.add(a);
        }
        Collections.sort(list);
        for(Times x:list)
        {
            System.out.println(x);
        }
    }
}
