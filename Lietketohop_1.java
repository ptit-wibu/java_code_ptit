/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.math.*;
import java.lang.*;
import java.text.*;
/**
 *
 * @author adminbk
 */
public class Lietketohop_1 {
    static int n,k;
    static int [] a = new int [20];
    static int cnt = 0;
    static void Try(int i)
    {
        for(int j = a[i-1] + 1; j<= n-k+i;j++)
        {
            a[i] = j;
            if(i == k)
            {
                cnt++;
                for(int index = 1; index <=k;index++)
                {
                    System.out.print(a[index] + " ");
                }
                System.out.println();
            }
            else Try(i+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
