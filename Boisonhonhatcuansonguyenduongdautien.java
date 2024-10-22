/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
/**
 *
 * @author ADMIN
 */
public class Boisonhonhatcuansonguyenduongdautien {
    public static long gcd(long a, long b)
    {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b)
    {
        return a * b / gcd(a,b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long res = 1;
            for(long i = 1; i<=n; i++)
            {
                res = lcm(res,i);
            }
            System.out.println(res);
        }
    }
}
