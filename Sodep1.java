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
public class Sodep1 {
    public static boolean check(String s)
    {
        for(char x:s.toCharArray())
        {
            if((x - '0')%2 != 0) return false;
        }
        StringBuilder builder = new StringBuilder();
        StringBuilder res = new StringBuilder();
        res = res.append(s);
        builder = builder.append(s);
        builder = builder.reverse();
        String ss = res.toString();
        String sss = builder.toString();
        if(!ss.equals(sss)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
