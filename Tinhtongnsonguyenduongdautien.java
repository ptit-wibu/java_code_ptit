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
public class Tinhtongnsonguyenduongdautien {
    public static long solve(long n)
    {
        long ans = n * (n+1)/2;
        return ans;
    }
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }
}
