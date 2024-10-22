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
public class Xaukhacnhaudainhat {
    public static boolean check(String a, String b)
    {
        if(a.length() != b.length()) return true;
        for(int i = 0; i<a.length();i++)
        {
            if(a.charAt(i) != b.charAt(i)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0)
        {
            String a = sc.next();
            String b = sc.next();
            if(check(a,b)==true) System.out.println(Math.max(a.length(), b.length()));
            else System.out.println("-1");
        }
    }
}
