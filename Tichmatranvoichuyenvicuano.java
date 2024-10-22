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
public class Tichmatranvoichuyenvicuano {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <=t; test++)
        {
            int m,n;
            m = sc.nextInt();
            n = sc.nextInt();
            int [][] a = new int [m][n];
            int [][]b = new int [n][m];
            for(int i = 0; i<m; i++)
            {
                for(int j = 0; j<n;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<m;j++)
                {
                    b[i][j] = a[j][i];
                }
            }
            int [][] res = new int [m][m];
            for(int i = 0; i<m;i++)
            {
                for(int j = 0; j<m;j++)
                {
                    for(int k = 0; k<n; k++)
                    {
                        res[i][j] += (a[i][k] *b[k][j]);
                    }
                }
            }
            System.out.print("Test " + test +": " + "\n");
            for(int i = 0; i<m;i++)
            {
                for(int j = 0; j<m;j++)
                {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
