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
public class UocSoChiaHetCho2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            long n = sc.nextLong();
            long cnt = 0;
            for(long i = 1; i<= Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    if( i % 2 == 0) cnt++;
                    if((n/i) % 2 == 0) cnt++;
                    if(i % 2 == 0 && i*i==n) cnt--;
                }
            }
            System.out.println(cnt);
        }
    }
}
