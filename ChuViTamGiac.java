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
/*class Point {
    private double x;
    private double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public Point(){
        
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public double distance(Point secondPoint)
    {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }
    public double distance(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public String toString()
    {
        return "INVALID";
    }
}*/

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Point a,b,c;
            a = new Point(sc.nextDouble(), sc.nextDouble());
            b = new Point(sc.nextDouble(), sc.nextDouble());
            c = new Point(sc.nextDouble(), sc.nextDouble());
            if(a.distance(b) + b.distance(c) <= c.distance(a) || a.distance(b) + a.distance(c) <= b.distance(c) || b.distance(c) + c.distance(a) <= a.distance(b))
            {
                System.out.println("INVALID");
            }
            else
            {
                DecimalFormat df = new DecimalFormat("0.000");
                System.out.println(df.format(a.distance(b) + b.distance(c) + c.distance(a)));
            }
        }
    }
}
