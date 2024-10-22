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
public class tinhsofibonacci {
    public static long []a = new long[93];
    public static void fibo()
    {
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for(int i = 3; i<93;i++) a[i] = a[i-1] + a[i-2];
    }
    public static void main(String[] args)
    {
        fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
}
