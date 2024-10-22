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
public class TongUocSo {
    static int []a = new int [(int)2e6+5];
    public static void sinh()
    {
        for(int i = 2;i<= Math.sqrt((double)2e6); i++)
        {
            if(a[i] == 0)
            {
                for(int j = i*i; j<=2e6; j+=i)
                {
                    a[j] = i;
                }
            }
        }
        for(int i = 2; i<= 2e6; i++)
        {
            if(a[i] == 0) a[i] = i;
        }
    }
    public static void main(String[] args)
    {
        sinh();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        while(t-- != 0)
        {
            int n = sc.nextInt();
            while(n > 1)
            {
                res += a[n];
                n/=a[n];
            }
        }
        System.out.println(res);
    }
}
