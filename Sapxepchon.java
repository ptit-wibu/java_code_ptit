/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.math.*;
/**
 *
 * @author adminbk
 */
public class Sapxepchon {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int [n];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1;i++)
        {
            System.out.print("Buoc " + (i+1) + ": ");
            int flag = i;
            for(int j = i+1; j<n;j++)
            {
                if(a[j] < a[flag]) {
                    flag = j;
                }
            }
            int tmp = a[i];
            a[i] = a[flag];
            a[flag] = tmp;
            for(int k = 0; k<n;k++)
            {
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
