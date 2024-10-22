/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.text.*;
/**
 *
 * @author adminbk
 */
public class Bosungdayso {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int []cnt = new int [205];
        boolean check = true;
        int max = 0;
        for(int i = 0; i<n; i++)
        {
            int tmp = sc.nextInt();
            cnt[tmp]++;
            if(i == n-1) max= tmp;
        }
        for(int i = 1; i<=max; i++)
        {
            if(cnt[i] == 0)
            {
                System.out.println(i);
                check = false;
            }
        }
        if(check == true) System.out.println("Excellent!");
    }
}
