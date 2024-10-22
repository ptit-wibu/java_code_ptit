/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
/**
 *
 * @author adminbk
 */
public class Diemcanbang {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextLong();
            long [] a = new long [(int)n];
            long []dp = new long [(int)n];
            long sum = 0;
            for(int i = 0; i<n;i++)
            {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            dp[0] = a[0];
            for(int i = 1; i<n; i++)
            {
                dp[i] = dp[i-1] + a[i];
            }
            boolean check = false;
            for(int i = 0; i<n ; i++)
            {
                if(dp[i] == (sum - dp[i] + a[i]))
                {
                    check = true;
                    System.out.println((i+1));
                    break;
                }
            }
            if(check == false) System.out.println(-1);
        }
    }
}
