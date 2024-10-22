/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;

import java.util.*;

/**
 *
 * @author Adminbk
 */
public class Uocsonguyentolonnhat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            long ans = -1;
            for(long i = 2; i<=Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    ans = Math.max(ans, i);
                    while(n % i  == 0)
                    {
                        n/=i;
                    }
                }
            }
            if(n > 1) System.out.println(n);
            else System.out.println(ans);
        }
    }
}