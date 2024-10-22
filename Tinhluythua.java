/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
/**
 *
 * @author Adminbk
 */
public class Tinhluythua {
    static long mod = (long) 1e9 + 7;
    public static long pow(long a, long b)
    {
        if(b==0) return 1;
        if(b == 1) return a;
        long res = pow(a,b/2);
        if(b%2==0) return (res * res) % mod;
        else return (((res * res) % mod) * a) % mod;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a;
        long b;
        while(1 != 0)
        {
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
            System.out.println(pow(a,b));
        }
    }
}