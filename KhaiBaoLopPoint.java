/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
//import com.mycompany.codeptit.classthongdung.Point;
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
import java.text.*;
class Point {
    private double x;
    private double y;
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    Point(Point p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    Point(){
        
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
}
/**
 *
 * @author adminbk
 */
public class KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            Point a,b;
            a = new Point(sc.nextDouble(), sc.nextDouble());
            b = new Point(sc.nextDouble(), sc.nextDouble());
            DecimalFormat df = new DecimalFormat("0.0000");
            double ans = new Point().distance(a, b);
            System.out.println(df.format(ans));
        }
    }
}
