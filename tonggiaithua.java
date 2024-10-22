/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.Scanner;
/**
 *
 * @author Adminbk
 */
public class tonggiaithua {
    static long []a = new long [21];
    public static void sinh()
    {
        a[0] = 0;
        a[1] = 1;
        for(int i = 2; i<21; i++)
        {
            a[i] = i*a[i-1];
        }
    }
    public static void main(String[] args)
    {
        sinh();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 1; i<=n; i++)
        {
            ans += a[i];
        }
        System.out.println(ans);
    }
}

