/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
/**
 *
 * @author adminbk
 */
public class Soxacach {
    
    static int []a  = new int [11];
    static int []unused = new int [20];
    static int n;
    static void print()
    {
        for(int i = 1; i<n;i++)
        {
            if(Math.abs(a[i] - a[i+1]) == 1) return;
        }
        for(int i = 1; i<=n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void Try(int i)
    {
        for(int j = 1 ; j<=n; j++)
        {
            if(unused[j] == 0)
            {
                a[i] = j;
                unused[j] = 1;
                if(i == n) print();
                else Try(i+1);
                unused[j] = 0;
            }  
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            n = sc.nextInt();
            Try(1);
        }
    }
}
