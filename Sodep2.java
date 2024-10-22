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
public class Sodep2 {
    public static boolean check(String s)
    {
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') return false;
        int sum = 0;
        for(char x:s.toCharArray())
        {
            sum += (x - '0');
        }
        if(sum % 10 != 0) return false; 
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