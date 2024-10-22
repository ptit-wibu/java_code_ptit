/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;

class Rectange{
    private double width;
    private double height;
    private String color;
    Rectange()
    {
        this.width = 1;
        this.height = 1;
    }
    Rectange(double width, double height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public double findArea()
    {
        return this.height*this.width;
    }
    public double findPerimeter()
    {
        return (this.height+this.width)*2;
    }
}
/**
 *
 * @author adminbk
 */
public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange x =new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if(x.getWidth() <= 0 || x.getHeight()<=0)
        {
            System.out.println("INVALID");
        }
        else
        {
            String tmp = x.getColor();
            tmp = tmp.toLowerCase();
            char []c = tmp.toCharArray();
            c[0] = Character.toUpperCase(c[0]);
            System.out.print((int)x.findPerimeter() + " " +(int) x.findArea() + " ");
            for(char res:c) System.out.print(res);
        }
    }
}
