/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.codeptit;
import java.util.*;

/**
 *
 * @author adminbk
 */
public class Souuthe {
    public static boolean check1(char[]a)
    {
       if(a[0] == '0') return false;
       for(int i = 0; i<a.length;i++)
        {
            if(Character.isAlphabetic(a[i])) return false;
           
        }
       return true;
    }
    public static boolean check(char [] a)
    {
        int odd =0 , even=0;
        for(int i = 0; i<a.length;i++)
        {
            if((a[i] - '0')%2==0) even++;
            else odd++;
        }
        if(even % 2 == 0 && even > odd) return true;
        if(odd % 2 == 1 && odd > even) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            if(check1(s.toCharArray()) == false) System.out.println("INVALID");
            else
            {
                if(check(s.toCharArray()) == true) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
