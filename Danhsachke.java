/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.*;
import java.lang.*;
import java.text.*;

/**
 *
 * @author adminbk
 */
public class Danhsachke {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int [n+1][n+1];
        for(int i = 1; i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i<=n;i++)
        {
            System.out.print("List(" + i + ") = ");
            for(int j = 1;j<=n;j++)
            {
                if(a[i][j] == 1) 
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
