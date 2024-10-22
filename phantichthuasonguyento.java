/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.Scanner;
import java.util.HashMap;
/**
 *
 * @author Adminbk
 */
public class phantichthuasonguyento {
    public static boolean check(long i)
    {
        if(i < 2) return false;
        if(i == 2) return true;
        if(i % 2 == 0) return false;
        for(int j = 3; j<= Math.sqrt(i); j+=2)
        {
            if(i % j == 0) return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test;
        for(test = 1; test <=t; test++)
        {
            /*long n = sc.nextLong();
            if(check(n) == true)
            {
                System.out.print("Test " + test + ": " + n + "(1)" );
                System.out.println();
                continue;
            }
            HashMap <Long, Long> mp = new HashMap<>();
            long k = n;
            for(long i = 2; i <= k; i++)
            {
                long cnt = 0;
                while(k % i == 0)
                {
                    cnt++;
                    k/=i;
                }
                if(cnt != 0) 
                {
                    mp.put(i, cnt);
                }
                if(k == 1) break;
            }
            System.out.print("Test " + test + ": ");
            mp.forEach((x,y) -> System.out.print(x + "(" + y + ") "));
            System.out.println();*/
            long n = sc.nextLong();
            System.out.print("Test " + test + ": ");
            for(int i = 2; i<= Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    int cnt = 0;
                    while(n%i==0)
                    {
                        cnt++;
                        n/=i;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if(n != 1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
