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
public class Matrannhiphan {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int res = 0;
        int [][] a = new int [n][3];
        for(int i = 0 ;i < n; i++)
        {
            int cnt1 = 0;
            for(int j  = 0; j<3; j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1) cnt1++;
            }
            if(cnt1 >= 2) res++;
        }
        System.out.println(res);
    }
}
