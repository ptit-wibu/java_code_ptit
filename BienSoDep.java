/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author adminbk
 */
public class BienSoDep {
    public static boolean check1(String res)
    {
        char[]c = res.toCharArray();
        for(int i = 0 ; i<c.length-1;i++)
        {
            if(c[i] != c[i+1]) return false;
        }
        return true;
    }
    public static boolean check2(String res)
    {
        char[]c = res.toCharArray();
        for(int i = 0 ; i<c.length;i++)
        {
            if(c[i] != '6' && c[i] != '8') return false;
        }
        return true;
    }
    public static boolean check3(String res)
    {
        char[]c = res.toCharArray();
        if(c[0] == c[1] && c[1] == c[2] &&c[3]==c[4])return true;
        else return false;
    }
     public static boolean check4(String res)
    {
        char[]c = res.toCharArray();
        for(int i = 0 ; i<c.length-1;i++)
        {
            if(c[i] >= c[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            String so = s.substring(5);
            so =  so.replace('.', ' ');
            String []res = so.split(" ");
           // for(String x:res) System.out.println(x);
            String ans = res[0] + res[1];
            //System.out.println(build);
            if(check1(ans) == true || check2(ans) == true || check3(ans) == true || check4(ans) == true)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
